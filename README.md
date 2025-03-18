# ********* Indirection Principle *********

## ***** Problem *****
An application prints messages directly using a **Screen Printer** class.  
If we want to switch to a different printer (e.g., file printer), we must **modify the application code**, making it less flexible.

## ***** How Indirection Helps *****
Using the **Indirection Principle**, we introduce a **Printer interface** as an intermediate layer.  
This allows the application to work with **any printer type** without modifying its code.  

- The **"with principle"** package demonstrates the **flexible** approach using indirection.
- The **"without principle"** package demonstrates the **rigid** approach without indirection.

## ***** Java Code *****
See the [`withprinciple`](src/Indirection/withprinciple) and [`withoutprinciple`](src/Indirection/withoutprinciple) packages for implementation details.

## 🎥 Video Explanation  
[➡ Click to watch the video](https://drive.google.com/file/d/1QA9BFst4PZwbSYmtQs1vQhEXJev-k2PL/view?usp=sharing)  

🚀 **Indirection ensures modular, scalable, and maintainable code!**  
