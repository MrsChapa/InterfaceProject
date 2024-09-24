public class ActionMovie implements MovieRecommender{
    
    
    
    public String searchAge(int age){
        if(age == 2012){
            return movieList[3];
        } else if(age == 2016){
            return movieList[4];
        } else if (age == 2017){
            return movieList[5];
        } else {
            return "There is no movie that released that year.";
        }
    }
    public String searchRating(int rating){
        if(rating == 8){
            return movieList[3];
        } else if(rating == 7){
            return movieList[4];
        } else if (rating == 6){
            return movieList[5];
        } else {
            return "There is no movie that has that rating.";
        }
    }
    public String searchMovie(String movie){
        if(movie.equals("Avengers") || movie.equals("Deadpool") || movie.equals("Despicable Me 3")){
            return "This movie exists.";
        } else {
            return "This movie does not exist.";
        }
    }
    public String recommendRandom(){
        return movieList[(int)Math.random()*3 + 3];
    }
    public String searchPrice(double price){
        if(price == 20){
            return movieList[3];
        } else if(price == 15){
            return movieList[4];
        } else if (price == 18){
            return movieList[5];
        } else {
            return "There is no movie that has this price.";
        }
    }
    
}