
package com.example.canteenautomationsystem.Response.Forgot_Password;

import com.google.gson.annotations.SerializedName;


public class ForgotResponse {

    @SerializedName("data")
    private Data mData;
    @SerializedName("message")
    private String mMessage;
    @SerializedName("status")
    private Boolean mStatus;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public Boolean getStatus() {
        return mStatus;
    }

    public void setStatus(Boolean status) {
        mStatus = status;
    }

}
