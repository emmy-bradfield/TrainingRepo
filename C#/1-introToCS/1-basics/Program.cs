using System;

namespace myFirstApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Console: Hello there! What is your name?");
            Console.Write("You: ");
            String name = Console.ReadLine();
            Console.WriteLine("Console: Nice to meet you, " + name + ". My name is console!");
            Console.WriteLine("Console: Do you have a message for me?");
            Console.Write(name + ": ");
            String message = Console.ReadLine();
            Console.WriteLine("Console: Brilliant! I'll deliver that message right away! Goodbye now");
            Console.WriteLine("\n\n*Console did not deliver " + name + "'s message. Console got distracted, and the world never knew that " + name + " said '" + message.ToLower() + "'...*");
        }
    }
}