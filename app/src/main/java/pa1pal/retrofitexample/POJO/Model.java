package pa1pal.retrofitexample.POJO;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by pa1pal on 2/10/15.
 */
public class Model
{
    private City city;
    private String cod;
    private float message;
    private int cnt;
    private java.util.List<pa1pal.retrofitexample.POJO.List> list = new ArrayList<pa1pal.retrofitexample.POJO.List>();

    /**
     *
     * @return
     * The city
     */
    public City getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cod
     */
    public String getCod() {
        return cod;
    }

    /**
     *
     * @param cod
     * The cod
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     *
     * @return
     * The message
     */
    public float getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(float message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The cnt
     */
    public int getCnt() {
        return cnt;
    }

    /**
     *
     * @param cnt
     * The cnt
     */
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    /**
     *
     * @return
     * The list
     */
    public java.util.List<pa1pal.retrofitexample.POJO.List> getList() {
        return list;
    }

    /**
     *
     * @param list
     * The list
     */
    public void setList(java.util.List<pa1pal.retrofitexample.POJO.List> list) {
        this.list = list;
    }
}