package Model;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


import static java.util.Locale.US;

public class AuthToken {

    @SerializedName("access_token")
    String accessToken;

    @SerializedName("token_type")
    String tokenType;

    @SerializedName("expires_in")
    Integer expiresIn;

    @SerializedName(".issued")
    String issued;

    @SerializedName(".expires")
    String expires;

    public AuthToken() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getIssued() throws ParseException {
        return issued;
    }

    public void setIssued(String issued) throws ParseException {
        this.issued = issued;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "AuthToken{" +
                "accessToken='" + accessToken + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", expiresIn=" + expiresIn +
                ", issued='" + issued + '\'' +
                ", expires='" + expires + '\'' +
                '}';
    }

    public Calendar getIssuedInCalendar() throws ParseException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", US);
        cal.setTime(formatter.parse(this.issued));
        return cal;
    }

    public Calendar getExpiresInCalendar() throws ParseException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", US);
        cal.setTime(formatter.parse(this.expires));
        return cal;
    }
}
