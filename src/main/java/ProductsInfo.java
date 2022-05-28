public class ProductsInfo{

	public static Book[] books;

    public ProductsInfo() {
       this.books = new Book[3];
        
       initializeBooks();
    }
    
    public void initializeBooks() {
        this.books[0] = new Book(
                "Dzieje Polski Tom 1: Skąd nasz ród", 
                "Andrzej Nowak",
                "Pierwszy tom pomnikowych `Dziejów Polski`, napisanych przez wybitnego historyka z Uniwersytetu Jagiellońskiego i Polskiej Akademii Nauk prof. Andrzeja Nowaka, obejmuje okres od początków państwa polskiego do 1202 r. (śmierć Mieszka III Starego).", 
                "Bialy kruk", 
                "https://images-na.ssl-images-amazon.com/images/I/41D2LHH0LJL._SX432_BO1,204,203,200_.jpg", 
                "1 stycznia 2014", 
                49.98 );
		this.books[1] = new Book(
				"Dzieje Polski Tom 1: Skąd nasz ród",
				"Andrzej Nowak",
				"Pierwszy tom pomnikowych `Dziejów Polski`, napisanych przez wybitnego historyka z Uniwersytetu Jagiellońskiego i Polskiej Akademii Nauk prof. Andrzeja Nowaka, obejmuje okres od początków państwa polskiego do 1202 r. (śmierć Mieszka III Starego).",
				"Bialy kruk",
				"https://images-na.ssl-images-amazon.com/images/I/41D2LHH0LJL._SX432_BO1,204,203,200_.jpg",
				"1 stycznia 2014",
				49.98 );
		this.books[3] = new Book(
				"Dzieje Polski Tom 1: Skąd nasz ród",
				"Andrzej Nowak",
				"Pierwszy tom pomnikowych `Dziejów Polski`, napisanych przez wybitnego historyka z Uniwersytetu Jagiellońskiego i Polskiej Akademii Nauk prof. Andrzeja Nowaka, obejmuje okres od początków państwa polskiego do 1202 r. (śmierć Mieszka III Starego).",
				"Bialy kruk",
				"https://images-na.ssl-images-amazon.com/images/I/41D2LHH0LJL._SX432_BO1,204,203,200_.jpg",
				"1 stycznia 2014",
				49.98 );
//        this.books[0].publisher = " ";
//        System.out.println(this.books[0].publisher);
//
  
       
    }
    
//    public static String[] getBookNames() throws IOException {
//		int count=0;
//
//		final int SIZE = 7;
//
//		String[] books = new String[SIZE];
//
//		File myFile = new File("BookPrices.txt");
//		Scanner inputFile = new Scanner(myFile);
//
//		while(inputFile.hasNext() && count < books.length)
//		{
//			String str;
//
//			str= inputFile.nextLine();
//
//			String[] parts = str.split(",");
//			books[count]=parts[0];
//		 	count++;
//		}
//		inputFile.close();
//
//		return books;
//	}
//
//    public static double[] getBookPrices() throws IOException{
//		int count=0;
//		final int SIZE = 7;
//		double[] prices = new double[SIZE];
//
//		File myFile = new File("BookPrices.txt");
//		Scanner inputFile = new Scanner(myFile);
//
//		while(inputFile.hasNext() && count < prices.length)
//		{
//			String str;
//
//			str = inputFile.nextLine();
//			String[] parts = str.split(",");
//
//		 	prices[count]= Double.parseDouble(parts[1]) ;
//		 	count++;
//		}
//		inputFile.close();
//
//		return prices;
//	}
//
//
}
