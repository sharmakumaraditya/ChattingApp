package com.example.adityakumarsharma.chattingapp.core.login;

/**
 * Created by Aditya Kumar Sharma on 8/3/2017.
 */
import android.app.Activity;


public interface LoginContract {
    interface View {
        void onLoginSuccess(String message);

        void onLoginFailure(String message);
    }

    interface Presenter {
        void login(Activity activity, String email, String password);
    }

    interface Interactor {
        void performFirebaseLogin(Activity activity, String email, String password);
    }

    interface OnLoginListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}
