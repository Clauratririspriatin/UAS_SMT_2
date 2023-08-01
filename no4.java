// clauura 
//227064516061
public abstract class Novel {

    // Definisi class abstract "Novel"
    private String title;
    private String author;
    private int pageCount;

    // Konstruktor
    public Novel(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Method abstract untuk menghitung rating novel
    public abstract double calculateRating();

    // Method untuk menampilkan informasi novel
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Rating: " + calculateRating());
    }
}

// Implementasi class abstract "Novel" untuk genre fiksi
class FictionNovel extends Novel {
    private int numChapters;

    // Konstruktor
    public FictionNovel(String title, String author, int pageCount, int numChapters) {
        super(title, author, pageCount);
        this.numChapters = numChapters;
    }

    // Override method untuk menghitung rating novel fiksi
    @Override
    public double calculateRating() {
        // Sebagai contoh, rating fiksi dihitung berdasarkan jumlah bab dibagi 2
        return numChapters / 2.0;
    }
}

// Implementasi class abstract "Novel" untuk genre non-fiksi
class NonFictionNovel extends Novel {
    private String topic;

    // Konstruktor
    public NonFictionNovel(String title, String author, int pageCount, String topic) {
        super(title, author, pageCount);
        this.topic = topic;
    }

    // Override method untuk menghitung rating novel non-fiksi
    @Override
    public double calculateRating() {
        // Sebagai contoh, rating non-fiksi dihitung berdasarkan panjang topik
        return topic.length() * 0.1;
    }
}



    
