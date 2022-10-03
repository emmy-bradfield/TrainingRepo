using System;
using System.Collections.Generic;

namespace Condition
{
    public class Pasta
    {
        public bool Fresh;
        public decimal Price;
        public string Brand;
        public int BrandRank;
        public int TypeRank;
        public int Rating;
        public string Title;

        public Pasta(){}

        public Pasta (bool fresh, decimal price, string brand)
        {
            Fresh = fresh;
            Brand = brand;
            Price = price;
            Rating = this.BrandRank + this.TypeRank;
        }
    }

    public class Tortellini: Pasta
    {
        public Tortellini(bool fresh, decimal price, string brand): base(fresh, price, brand){}
    }

    public class Spaghetti: Pasta
    {
        public Spaghetti(bool fresh, decimal price, string brand): base(fresh, price, brand){}
    }

    public class Farfelle: Pasta
    {
        public Farfelle(bool fresh, decimal price, string brand): base(fresh, price, brand){}
    }

    public class Penne: Pasta
    {
        public Penne(bool fresh, decimal price, string brand): base(fresh, price, brand){}
    }

    public class OrderBy
    {
        public static List<Pasta> PastaRank(List<Pasta> pastaList)
        {
            decimal maxFresh = 3.50M;
            decimal maxDry = 2.00M;

            string[] pastaPreference = new string[4];
            pastaPreference[0] = "Tortellini";
            pastaPreference[1] = "Farfelle";
            pastaPreference[2] = "Spaghetti";
            pastaPreference[3] = "Penne";
            string[] brandPreference = new string[3];
            brandPreference[0] = "Tesco";
            brandPreference[1] = "Co-Op"; 
            brandPreference[2] = "Sainsbury's";

            List<Pasta> pastas = pastaList;

            List<Pasta> pastaChoice = new List<Pasta>();
            foreach(Pasta pasta in pastas)
            {
                string pastaName = pasta.GetType().ToString().Substring(10);
                pasta.BrandRank = 0;
                pasta.TypeRank = 0;
                pasta.Title = $"{pasta.Brand} {pastaName} @ £{pasta.Price}";

                if ((pasta.Fresh && pasta.Price <= maxFresh) || (!pasta.Fresh && pasta.Price <= maxDry))
                {
                    for (int i = 0; i < pastaPreference.Length; i++)
                    {
                        if (pastaName == pastaPreference[i])
                        {
                            pasta.TypeRank = ++i;
                            break;
                        }
                    }
                    for (int i = 0; i < brandPreference.Length; i++)
                    {
                        if (pasta.Brand == brandPreference[i])
                        {
                            pasta.BrandRank = ++i;
                            break;
                        }
                    }

                    if (pasta.TypeRank > 0 && pasta.BrandRank > 0)
                    {
                        pasta.Rating = pasta.TypeRank + pasta.BrandRank;
                        int i = 0;
                        while (i < pastaChoice.Count)
                        {
                            if ((pasta.Rating < pastaChoice[i].Rating) || (pasta.Rating == pastaChoice[i].Rating && pasta.Price < pastaChoice[i].Price))
                            {
                                pastaChoice.Insert(i, pasta);
                                break;
                            }
                            i++;
                        }
                        if (i == pastaChoice.Count) pastaChoice.Add(pasta);
                    }
                } else pastaChoice.Add(pasta);
            }
            return pastaChoice;
        }
    }
}