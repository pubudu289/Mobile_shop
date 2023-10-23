/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ku.Common;

/**
 *
 * @author Pubudu Kasun
 */
public class SystemData {
    private static String currentUser;
    private static String userId;


    public static String getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(String aCurrentUser) {
        currentUser = aCurrentUser;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String aUserId) {
        userId = aUserId;
    }

}
