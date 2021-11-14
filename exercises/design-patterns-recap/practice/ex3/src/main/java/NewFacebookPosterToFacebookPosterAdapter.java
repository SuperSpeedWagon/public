import java.util.Date;

public class NewFacebookPosterToFacebookPosterAdapter implements FacebookPoster {
    private NewFacebookPosterImpl poster;

    public NewFacebookPosterToFacebookPosterAdapter(){
        this.poster = new NewFacebookPosterImpl();
    }

    @Override
    public long postMessage(String message) {
        Post post = new Post(message, new Date());
        return poster.post(post);
    }

    @Override
    public String getMessage(long postId) {
        return poster.get(postId).getMessage();
    }
}
