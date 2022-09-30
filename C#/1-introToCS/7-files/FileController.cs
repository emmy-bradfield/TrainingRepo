using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace FileReadWrite
{
    public class FileController
    {
        protected List<Item> _items;
        public string fileName;

        public FileController(){}

        public void ExtractTextFile(string fileName){
            this.fileName = fileName;
            Extract();
            Boolean valid = false;
            String TO = "";
            Console.WriteLine("Where would you like to extract the contents?");
            System.Threading.Thread.Sleep(500);
            while (!valid){
                Console.Write("\nCONSOLE - write the contents of the file line-by-line to the console\nTEXTFILE - write the contents to a new .txt file (stored in /_extracts\n\n>>");
                TO = Console.ReadLine().ToUpper();
                if (TO == "CONSOLE" || TO == "TEXTFILE") valid = true;
                else Console.WriteLine("\nInvalid Selection. Please try again");
            }
            Read(TO);

        }

        public override string ToString()
        {
            StringBuilder items = new StringBuilder(_items.Count);
            foreach (Item item in _items)
            {
                items.Append(item.ToString() + Environment.NewLine);
            }
            return items.ToString();
        }

        public void Extract()
        {
            string[] items = File.ReadAllLines($"../../../{this.fileName}");
            _items = new List<Item>(items.Length);
            for (int i = 0; i < items.Length; i++)
            {
                string[] itemsArray = items[i].Split(',');
                ExtractItem(new Item(itemsArray[0], itemsArray[1]));
            }
        }

        public void ExtractItem(Item item)
        {
            _items.Add(item);
        }

        public void Read(string TO)
        {
            ToString();

            if (TO == "CONSOLE")
            {
                foreach (Item line in _items)
                {
                    CONSOLE(line.ToString());
                }
            }
            else if (TO == "TEXTFILE")
            {
                System.IO.Directory.CreateDirectory("./_extracts/");
                if (System.IO.Directory.Exists($"./_extracts/{fileName}")) System.IO.Directory.Delete($"./_extracts/{fileName}");
                String output = "";
                foreach (Item line in _items)
                {
                    output += line.ToString() + "\n";
                }
                TEXTFILE(output);
            }  
        }
    public void CONSOLE(string line)
    {
        Console.WriteLine(line);
        System.Threading.Thread.Sleep(1000);
    }

    public void TEXTFILE(string contents)
    {
        File.WriteAllText($"./_extracts/{fileName}", contents);
    }

    }

}