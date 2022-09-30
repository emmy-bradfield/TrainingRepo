using System;
using FileReadWrite;

namespace Program
{
    class Runner
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Starting File Read/Write Controller");
            System.Threading.Thread.Sleep(2000);
            Boolean running = true;
            while (running){
                Console.Write("\n\nPlease enter the file you wish to read\n>>");
                String file = Console.ReadLine();
                while (!System.IO.File.Exists($"../../../{file}")) 
                {
                    System.Threading.Thread.Sleep(1500);
                    Console.Write($"\nERROR: {file} could not be found in current directory. Please try again\n>>");
                    file = Console.ReadLine();
                } 
                Console.Write("\n\n");
                System.Threading.Thread.Sleep(1000);
                Console.WriteLine("Started File Read/Write Controller");
                FileController tasty_secrets = new FileController();
                tasty_secrets.ExtractTextFile(file);
                Console.Write("\n\nExtraction Complete\nUse key 'X' to close the programme, or any other key to extract another file\n>>");
                String c = Console.ReadLine();
                if (c.ToUpper() == "X") running = false;
            }
            
            
        }
    }
}