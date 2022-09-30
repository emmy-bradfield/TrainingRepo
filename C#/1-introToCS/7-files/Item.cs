using System;

namespace FileReadWrite
{
    public class Item
    {
        public string item;
        public string description;

        public Item(string item)
        {
            this.item = item;
        }

        public Item (string item, string description)
        {
            this.item = item;
            this.description = description;
        }

        public override string ToString()
        {
            return $"{item} : {description}";
        }
    }
}