import tkinter as tk
import datetime

def openJournal(event):
    print("Welcome back")

def userName():
    if (name != ''):
        textArea = tk.Text(master=window, height=10, width=25)
        textArea.grid(column=3, row=0)
        answer = "Hey there, {}, welcome to your new bullet journal!".format(name)
        textArea.insert(tk.END,answer)
    else:
        welcome=tk.Label(text = "Please enter your name to begin")
        welcome.grid(column=3, row=1)

window=tk.Tk()
window.title("Bullet Journal")
window.geometry("600x400")

name=tk.Label(text = "Your Name")
name.grid(column=0, row=1)
nameEntry = tk.Entry()
nameEntry.grid(column=0,row=2)
submit=tk.Button(window, text="Submit", command=userName())
submit.grid(column=0,row=5)

window.mainloop()

#tk.Entry(parent, width=25)
#header = tk.Label(text="Welcome to your virtual bullet journal")
#header.grid(column=1,row=0)
#open_book = tk.Button(window, text = "Open Your Journal")
#open_book.grid(column=1, row=1)
#open_book.bind("<Button 1>", openJournal)

#window.mainloop()