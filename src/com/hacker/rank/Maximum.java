package com.hacker.rank;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Maximum {

    static int maxDifference(int[] a) {
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int diff = -1;
                if (a[i] < a[j])
                    diff = a[j] - a[i];
                if (diff > max)
                    max = diff;
            }
        }
        return max;
    }

    static long kSub(int k, int[] nums) {
        long res = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            if (nums[i] % k == 0) res++;
            long sum = nums[i];
            for (int j = i+1; j < i+k; j++) {
                sum = sum + nums[j];
                if (sum % k == 0) res++;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            String comment = "";
            if (!(line.contains("/*") && line.contains("//"))) {
                if (line.contains("//")) {
                    comment = line.substring(line.indexOf("//"), line.lastIndexOf(line));
                }
                else {
                    while (!line.contains("*/")) {
                        line = line + in.nextLine();
                    }
                    comment = line.substring(line.indexOf("/*"), line.indexOf("*/"));
                }
            }
            else {
                if (line.contains("*/") && line.indexOf("//") > line.indexOf("*/")) {
                    comment = line.substring(line.indexOf("/*"), line.indexOf("*/"));
                    comment = comment + "\n" + line.substring(line.indexOf("//"), line.lastIndexOf(line));
                } else {
                    while (!line.contains("*/")) {
                        line = line + in.nextLine();
                    }
                    comment = line.substring(line.indexOf("/*"), line.indexOf("*/"));
                }
            }
            System.out.println(comment);
        }
        //final String fileName = System.getenv("OUTPUT_PATH");
        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        long res;

        int _a_size = 0;
        //_a_size = Integer.parseInt(in.nextLine());
        int[] _a = {1,2,3,4,1};//new int[_a_size];
        /*int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine());
            _a[_a_i] = _a_item;
        }*/

        //res = maxDifference(_a);
        res = kSub(3, _a);
        System.out.print(res);
        /*bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();*/
    }
}
