using System;

namespace Lists
{
    static class Iterator
    {
        public static void PrintItems(List<String> list)
        {
            foreach (string item in list)
            {
                Console.WriteLine(item);
            }
        }

        public static void RemoveItem(List<String> list, String target)
        {
            for (int i = 0; i < list.Count; i++)
            {
                if (list[i] == target)
                {
                    list.RemoveAt(i);
                }
            Console.WriteLine(list[i]);
            }
        }
    }
}