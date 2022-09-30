using System;

namespace People
{
    class Person
    {
        protected string name;
        protected string catchphrase;
        
        public Person(){
            this.name = "Person";
            this.catchphrase = "(-_-)";
        }

        public Person(string catchphrase){
            this.name = "Person";
            this.catchphrase = catchphrase;
        }

        public string speak()
        {
            return (name + ": " + catchphrase);
        }
    }

    class Emily: Person{

        public Emily(): base("(⌐■_■)"){
            this.name = "Emily";
        }

        public Emily(string catchphrase): base(catchphrase + " (but in a cool way)"){
            this.name = "Emily";
        }
    }

    class James: Person{

        public James(): base("(>_<)"){
            this.name = "James";
        }
       
        public James(string catchphrase): base(catchphrase + " (but in a lame way)"){
            this.name = "James";
        }

    }

}
