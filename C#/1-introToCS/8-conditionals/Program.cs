using System;
using System.Collections.Generic;
using Condition;

namespace Program
{
    class Runner
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("==== CONDITIONAL BRANCHING ====\n");

            # region Light Source
            Console.WriteLine("1: Moth Flight using If-Statements:");
            If.LightSource();
            # endregion

            # region Pasta Ranking
            Console.WriteLine("\n2: Pasta Ranking using If-Statements and Booleans:");
            List<Pasta> pastas = new List<Pasta>();
            pastas.Add(new Tortellini(true, 2.20M, "Co-Op"));
            pastas.Add(new Tortellini(false, 1.65M, "Tesco"));
            pastas.Add(new Penne(false, 1.10M, "Tesco"));
            pastas.Add(new Penne(true, 1.25M, "Sainsbury's"));
            pastas.Add(new Spaghetti(false, 0.69M, "Tesco"));
            pastas.Add(new Farfelle(false, 1.45M, "Tesco"));
            pastas.Add(new Farfelle(true, 3.85M, "Co-Op"));

            List<Pasta> rankedPastas = OrderBy.PastaRank(pastas);
            int i = 1;
            foreach (Pasta pasta in rankedPastas)
            {
                Console.WriteLine($"{i} = {pasta.Title}");
                System.Threading.Thread.Sleep(500);
                i++;
            }
            # endregion

            # region Unnamed
            Console.WriteLine("\n3: Decision making with switch statements");
            
            # endregion
        }
    }
}