public interface MovieRecommender{

  String[] movieList = new String[]{"Tag", "Step Brothers", "Despicable Me 4","Avengers", "Deadpool", "Despicable Me 3"};

  String searchAge(int age);
  String searchRating(int rating);
  String searchMovie(String movie);
  String recommendRandom();
  String searchPrice(double price);
  
}