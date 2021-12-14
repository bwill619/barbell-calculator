import tkinter as tk

class barbell(tk.Frame):
    def __init__(self, master=None):
        super().__init__(master)
        self.master = master
        self.pack()
        self.create_widgets()

    def create_widgets(self):
        test = x

    def calculate(self):
        fourFive = 45
        threeFive = 35
        twoFive = 25
        oneFive = 15
        ten = 10
        five = 5
        twoPointFive = 2.5

root = tk.Tk()
app = barbell(master=root)
app.mainloop()