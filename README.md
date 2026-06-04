# ⚡ Smart Electricity Billing Calculator

A simple and interactive web application to calculate electricity bills based on real-world slab rates. I built this project to bridge core electrical engineering domain logic with practical software development. 

## 🚀 Live Demo

You can test the calculator directly in your browser here:
👉 **[Live Web App (Vercel)](https://electricity-bill-system-zip.vercel.app)**

## 💡 How It Works
The calculator takes the total units consumed as input and applies conditional pricing loops based on standard utility slab rates:
* **First 100 units:** ₹5.0 per unit
* **Next 100 units:** ₹7.0 per unit
* **Above 200 units:** ₹10.0 per unit

*Note: The core logic was originally designed and tested in Java (`electricitybilling.java`), and later ported to Vanilla JavaScript to build this interactive web interface.*

## 🛠️ Tech Stack
* **Frontend:** HTML5, CSS3, JavaScript (DOM Manipulation)
* **Backend Logic Backup:** Java (Core OOPs)
* **Hosting:** Vercel

## 📁 Files in this Repo
* `index.html` - The complete frontend and JS logic.
* `electricitybilling.java` - The initial terminal-based Java code.
* `README.md` - Project details.
