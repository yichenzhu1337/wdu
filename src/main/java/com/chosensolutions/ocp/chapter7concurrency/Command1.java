package com.chosensolutions.ocp.chapter7concurrency;

import java.io.InputStream;

public class Command1 implements Runnable {

    public void run() {

        try {
            //String[] cmdScript = new String[]{"/bin/bash", "path/to/myScript.sh"};
            Process procScript = Runtime.getRuntime().exec("sh " + System.getProperty("user.dir") + "/src/main/java/com/chapter7concurrency/test1.sh");

/*        System.out.println("Working Directory = " +
                System.getProperty("user.dir") + "/src/main/java/com/chapter7concurrency/test.sh");*/

            InputStream is = procScript.getInputStream();

            int i = 0;
            StringBuffer sb = new StringBuffer();
            while ((i = is.read()) != -1) {
                sb.append((char) i);
            }

            System.out.println(sb.toString());
        }
        catch (Exception e) {

        }

    }

}
