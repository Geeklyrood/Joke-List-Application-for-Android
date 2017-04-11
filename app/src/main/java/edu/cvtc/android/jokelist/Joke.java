package edu.cvtc.android.jokelist;

/**
 * Created by Keenan on 4/11/17.
 */

public class Joke {

    /**
     * Three possible ratings for a joke.
     */

    public static final int UNRATED = 0;
    public static final int LIKED = 1;
    public static final int DISLIKED = 2;

    private String text;
    private int rating;

    public Joke() {
        text = "";
        rating = UNRATED;
    }

    public Joke(final String text) {
        this.text = text;
        rating = UNRATED;
    }

    public Joke(final String text, final int rating) {
        this.text = text;
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     *
     * @return a string returning only the text of the joke.
     */
    @Override
    public String toString() {
        return getText();
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Joke joke = (Joke) o;
//
//        return text != null ? text.equals(joke.text) : joke.text == null;

        return o instanceof Joke
                && ((Joke) o ).getText().equals(text);
    }

}
