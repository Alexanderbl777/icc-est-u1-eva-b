import models.Boook;
import views.ViewsConsole;
import controllers.LibroController;

public class App {
    public static void main(String[] args) throws Exception {

        Boook[] books = {
                new Boook("Clean Code", 2008),
                new Boook("The Pragmatic Programmer", 1999),
                new Boook("Design Patterns: Elements of Reusable Object-Oriented Software", 1994),
                new Boook("Refactoring: Improving the Design of Existing Code", 1999),
                new Boook("Effective Java", 2001),
                new Boook("You Don't Know JS: Scope & Closures", 2014),
                new Boook("Introduction to the Theory of Computation", 1997),
                new Boook("Code: The Hidden Language of Computer Hardware and Software", 2000),
                new Boook("Structure and Interpretation of Computer Programs", 1985),
                new Boook("The Mythical Man-Month", 1975),
                new Boook("Head First Design Patterns", 2004),
                new Boook("Programming Pearls", 1986),
                new Boook("Algorithms", 1983),
                new Boook("Java Concurrency in Practice", 2006),
                new Boook("The Art of Computer Programming", 1968),
                new Boook("Computer Networking: A Top-Down Approach", 2000),
                new Boook("Artificial Intelligence: A Modern Approach", 1995),
                new Boook("Compilers: Principles, Techniques, and Tools", 1986),
                new Boook("Operating System Concepts", 1983),
                new Boook("Database System Concepts", 1986),
                new Boook("The C Programming Language", 1978),
                new Boook("Introduction to Algorithms", 1990),
                new Boook("The Linux Programming Interface", 2010),
                new Boook("Python Crash Course", 2015),
                new Boook("Cracking the Coding Interview", 2008),
                new Boook("The Go Programming Language", 2015),
                new Boook("Modern Operating Systems", 1992),
                new Boook("Computer Organization and Design", 1994),
                new Boook("Deep Learning", 2016),
                new Boook("The Elements of Statistical Learning", 2001)
        };
        ViewsConsole view = new ViewsConsole();
        view.mostrarLista(books);
        
        LibroController lC = new LibroController();
        lC.sortByName(books);
        view.mostrarLista(books);
    }
}
