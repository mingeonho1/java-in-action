package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] movieReviews = {
            new MovieReview("어바웃 타입", "인생 시간 영화!"),
            new MovieReview("인셉션", "인생은 무한 루프")
        };

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }
    }
}
