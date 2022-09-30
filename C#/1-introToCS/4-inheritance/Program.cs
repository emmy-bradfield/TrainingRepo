using System;
using People;

namespace Inheritance
{

    class Runner
    {
        public static void Main(string[] args)
        {
            Person person = new Person();
            Console.WriteLine(person.speak());

            Person emily = new Emily();
            Console.WriteLine(emily.speak());

            Person james = new James();
            Console.WriteLine(james.speak());

        }
    }

}