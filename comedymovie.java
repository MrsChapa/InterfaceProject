public class ComedyMovie implements MovieRecommender{
    
    public String searchAge(int age){
        if(age == 2018){
            return movieList[0];
        } else if(age == 2008){
            return movieList[1];
        } else if (age == 2024){
            return movieList[2];
        } else {
            return "There is no movie that released that year.";
        }
    }
    public String searchRating(int rating){
        if(rating == 8){
            return movieList[0];
        } else if(rating == 7){
            return movieList[1];
        } else if (rating == 6){
            return movieList[2];
        } else {
            return "There is no movie that has that rating.";
        }
    }
    public String searchMovie(String movie){
        if(movie.equals("Tag") || movie.equals("Step Brothers") || movie.equals("Despicable Me 4")){
            return "This movie exists.";
        } else {
            return "This movie does not exist.";
        }
    }
    public String recommendRandom(){
        return movieList[(int) (Math.random()*3)];
    }
    public String searchPrice(double price){
        if(price == 20){
            return movieList[0];
        } else if(price == 15){
            return movieList[1];
        } else if (price == 18){
            return movieList[2];
        } else {
            return "There is no movie that has this price.";
        }
    }
    
}