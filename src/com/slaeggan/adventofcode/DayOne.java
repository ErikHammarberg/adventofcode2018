package com.slaeggan.adventofcode;

import java.util.Arrays;
import java.util.HashSet;

public class DayOne {

    public static void main(String[] args) {
        var rawInput = "+6\n" +
                "-17\n" +
                "+16\n" +
                "+7\n" +
                "+12\n" +
                "+2\n" +
                "-7\n" +
                "-5\n" +
                "-4\n" +
                "-16\n" +
                "+2\n" +
                "+12\n" +
                "-16\n" +
                "-1\n" +
                "-12\n" +
                "-3\n" +
                "+8\n" +
                "-12\n" +
                "+8\n" +
                "-3\n" +
                "+18\n" +
                "-9\n" +
                "+1\n" +
                "-20\n" +
                "+15\n" +
                "-11\n" +
                "-18\n" +
                "-8\n" +
                "+18\n" +
                "-4\n" +
                "+10\n" +
                "+1\n" +
                "-2\n" +
                "+13\n" +
                "+12\n" +
                "+16\n" +
                "-6\n" +
                "+12\n" +
                "+2\n" +
                "+11\n" +
                "+5\n" +
                "+1\n" +
                "-14\n" +
                "+16\n" +
                "-20\n" +
                "-5\n" +
                "+20\n" +
                "+6\n" +
                "+13\n" +
                "+11\n" +
                "+3\n" +
                "-9\n" +
                "-15\n" +
                "+1\n" +
                "+19\n" +
                "+8\n" +
                "+19\n" +
                "-16\n" +
                "+19\n" +
                "-17\n" +
                "-17\n" +
                "+19\n" +
                "+2\n" +
                "+5\n" +
                "+16\n" +
                "+2\n" +
                "-4\n" +
                "+19\n" +
                "+6\n" +
                "-16\n" +
                "+15\n" +
                "+7\n" +
                "+5\n" +
                "-18\n" +
                "+19\n" +
                "-8\n" +
                "+9\n" +
                "+15\n" +
                "-3\n" +
                "-3\n" +
                "-15\n" +
                "+13\n" +
                "-1\n" +
                "+10\n" +
                "+13\n" +
                "+16\n" +
                "-4\n" +
                "+10\n" +
                "-12\n" +
                "+10\n" +
                "+17\n" +
                "-2\n" +
                "-17\n" +
                "+10\n" +
                "+17\n" +
                "+8\n" +
                "+7\n" +
                "+5\n" +
                "+17\n" +
                "+10\n" +
                "+14\n" +
                "-17\n" +
                "-13\n" +
                "+19\n" +
                "+6\n" +
                "-11\n" +
                "+10\n" +
                "+8\n" +
                "+1\n" +
                "-18\n" +
                "-5\n" +
                "-8\n" +
                "-19\n" +
                "+12\n" +
                "+12\n" +
                "-4\n" +
                "+8\n" +
                "-10\n" +
                "-9\n" +
                "+2\n" +
                "+11\n" +
                "-6\n" +
                "+23\n" +
                "+17\n" +
                "-10\n" +
                "+5\n" +
                "+9\n" +
                "+19\n" +
                "+4\n" +
                "-1\n" +
                "+6\n" +
                "+12\n" +
                "-16\n" +
                "+9\n" +
                "+6\n" +
                "-9\n" +
                "+4\n" +
                "-2\n" +
                "-14\n" +
                "-5\n" +
                "-9\n" +
                "+13\n" +
                "+10\n" +
                "-2\n" +
                "+17\n" +
                "+10\n" +
                "+13\n" +
                "-5\n" +
                "-12\n" +
                "+19\n" +
                "+10\n" +
                "+16\n" +
                "+13\n" +
                "-19\n" +
                "-17\n" +
                "+4\n" +
                "+12\n" +
                "+18\n" +
                "-14\n" +
                "+5\n" +
                "+17\n" +
                "-5\n" +
                "-4\n" +
                "+18\n" +
                "-5\n" +
                "-1\n" +
                "-18\n" +
                "+11\n" +
                "+12\n" +
                "+15\n" +
                "-9\n" +
                "+3\n" +
                "-7\n" +
                "+8\n" +
                "-16\n" +
                "+9\n" +
                "-13\n" +
                "-10\n" +
                "-11\n" +
                "+3\n" +
                "+2\n" +
                "+19\n" +
                "+21\n" +
                "+6\n" +
                "+6\n" +
                "+2\n" +
                "-5\n" +
                "-6\n" +
                "+13\n" +
                "-18\n" +
                "-15\n" +
                "-16\n" +
                "+8\n" +
                "-13\n" +
                "-14\n" +
                "+9\n" +
                "-3\n" +
                "-8\n" +
                "-11\n" +
                "+9\n" +
                "-15\n" +
                "-16\n" +
                "+4\n" +
                "+13\n" +
                "-18\n" +
                "+10\n" +
                "-3\n" +
                "+15\n" +
                "+8\n" +
                "-18\n" +
                "+13\n" +
                "-5\n" +
                "+18\n" +
                "+15\n" +
                "-20\n" +
                "+19\n" +
                "+26\n" +
                "+7\n" +
                "-4\n" +
                "+25\n" +
                "-8\n" +
                "-19\n" +
                "+13\n" +
                "-2\n" +
                "-8\n" +
                "+11\n" +
                "+22\n" +
                "-16\n" +
                "+9\n" +
                "-1\n" +
                "+20\n" +
                "+12\n" +
                "-9\n" +
                "+10\n" +
                "-8\n" +
                "+9\n" +
                "+19\n" +
                "+17\n" +
                "+10\n" +
                "+4\n" +
                "-11\n" +
                "+15\n" +
                "+5\n" +
                "+4\n" +
                "-11\n" +
                "+19\n" +
                "-7\n" +
                "-6\n" +
                "-9\n" +
                "-18\n" +
                "+2\n" +
                "-9\n" +
                "+16\n" +
                "-17\n" +
                "+21\n" +
                "+16\n" +
                "+7\n" +
                "+1\n" +
                "+11\n" +
                "-4\n" +
                "-20\n" +
                "+31\n" +
                "-1\n" +
                "+2\n" +
                "+17\n" +
                "-12\n" +
                "-12\n" +
                "+18\n" +
                "-16\n" +
                "+18\n" +
                "-6\n" +
                "+19\n" +
                "-5\n" +
                "+1\n" +
                "+11\n" +
                "-8\n" +
                "-1\n" +
                "-16\n" +
                "+15\n" +
                "+17\n" +
                "+4\n" +
                "+1\n" +
                "-8\n" +
                "+15\n" +
                "-3\n" +
                "+18\n" +
                "-9\n" +
                "-15\n" +
                "-16\n" +
                "-18\n" +
                "+7\n" +
                "-22\n" +
                "+21\n" +
                "-13\n" +
                "-19\n" +
                "+3\n" +
                "-25\n" +
                "+5\n" +
                "-8\n" +
                "-19\n" +
                "-18\n" +
                "-6\n" +
                "+12\n" +
                "-11\n" +
                "+19\n" +
                "+6\n" +
                "+19\n" +
                "+70\n" +
                "-12\n" +
                "-15\n" +
                "+3\n" +
                "+25\n" +
                "+1\n" +
                "+18\n" +
                "-12\n" +
                "+21\n" +
                "+14\n" +
                "+2\n" +
                "+6\n" +
                "-13\n" +
                "-12\n" +
                "+6\n" +
                "+3\n" +
                "+13\n" +
                "+2\n" +
                "+11\n" +
                "-9\n" +
                "+1\n" +
                "-13\n" +
                "+15\n" +
                "+15\n" +
                "+1\n" +
                "+10\n" +
                "-9\n" +
                "+5\n" +
                "+13\n" +
                "-17\n" +
                "+10\n" +
                "+3\n" +
                "+12\n" +
                "-7\n" +
                "-4\n" +
                "+6\n" +
                "+3\n" +
                "-16\n" +
                "+15\n" +
                "+13\n" +
                "-9\n" +
                "+12\n" +
                "+20\n" +
                "+10\n" +
                "+3\n" +
                "+14\n" +
                "+16\n" +
                "-1\n" +
                "-13\n" +
                "-9\n" +
                "+8\n" +
                "+2\n" +
                "+17\n" +
                "-13\n" +
                "+10\n" +
                "+1\n" +
                "+11\n" +
                "+20\n" +
                "+16\n" +
                "-14\n" +
                "+11\n" +
                "-17\n" +
                "-2\n" +
                "+20\n" +
                "+7\n" +
                "-24\n" +
                "-7\n" +
                "+14\n" +
                "-1\n" +
                "+5\n" +
                "+10\n" +
                "+26\n" +
                "-13\n" +
                "+30\n" +
                "+9\n" +
                "-6\n" +
                "+13\n" +
                "+31\n" +
                "+14\n" +
                "-1\n" +
                "+4\n" +
                "-24\n" +
                "-59\n" +
                "-10\n" +
                "+8\n" +
                "-20\n" +
                "-11\n" +
                "-14\n" +
                "-10\n" +
                "-6\n" +
                "-15\n" +
                "-3\n" +
                "-14\n" +
                "+10\n" +
                "+16\n" +
                "+2\n" +
                "-5\n" +
                "+4\n" +
                "-18\n" +
                "-13\n" +
                "-7\n" +
                "-11\n" +
                "-5\n" +
                "-7\n" +
                "-16\n" +
                "-15\n" +
                "-1\n" +
                "-10\n" +
                "+16\n" +
                "+8\n" +
                "-17\n" +
                "+12\n" +
                "-18\n" +
                "-5\n" +
                "-25\n" +
                "+17\n" +
                "-12\n" +
                "-10\n" +
                "-3\n" +
                "-10\n" +
                "+11\n" +
                "+4\n" +
                "-7\n" +
                "+19\n" +
                "+51\n" +
                "+4\n" +
                "+6\n" +
                "-5\n" +
                "-11\n" +
                "-2\n" +
                "+15\n" +
                "-6\n" +
                "-5\n" +
                "-29\n" +
                "-20\n" +
                "+6\n" +
                "+6\n" +
                "-4\n" +
                "-28\n" +
                "-13\n" +
                "-2\n" +
                "-15\n" +
                "-16\n" +
                "-64\n" +
                "+23\n" +
                "-36\n" +
                "-25\n" +
                "-21\n" +
                "-52\n" +
                "-118\n" +
                "-18\n" +
                "-28\n" +
                "+25\n" +
                "-6\n" +
                "+29\n" +
                "+26\n" +
                "+46\n" +
                "-69\n" +
                "-37\n" +
                "-75\n" +
                "-100\n" +
                "-463\n" +
                "-63213\n" +
                "+11\n" +
                "+13\n" +
                "-21\n" +
                "-4\n" +
                "+17\n" +
                "+29\n" +
                "-10\n" +
                "-16\n" +
                "+2\n" +
                "-16\n" +
                "+7\n" +
                "+11\n" +
                "-16\n" +
                "-9\n" +
                "-21\n" +
                "+6\n" +
                "-1\n" +
                "-8\n" +
                "-3\n" +
                "+7\n" +
                "-5\n" +
                "-18\n" +
                "+14\n" +
                "-10\n" +
                "+1\n" +
                "+7\n" +
                "+9\n" +
                "-19\n" +
                "+7\n" +
                "-18\n" +
                "-7\n" +
                "+8\n" +
                "-7\n" +
                "+10\n" +
                "+4\n" +
                "+7\n" +
                "+9\n" +
                "+18\n" +
                "+55\n" +
                "+21\n" +
                "+16\n" +
                "-13\n" +
                "-61\n" +
                "+11\n" +
                "-45\n" +
                "-35\n" +
                "-14\n" +
                "-8\n" +
                "-10\n" +
                "-12\n" +
                "+6\n" +
                "-7\n" +
                "+17\n" +
                "-2\n" +
                "-13\n" +
                "-20\n" +
                "+11\n" +
                "-13\n" +
                "+12\n" +
                "+13\n" +
                "-2\n" +
                "-8\n" +
                "+13\n" +
                "-23\n" +
                "-8\n" +
                "-9\n" +
                "+4\n" +
                "+2\n" +
                "+4\n" +
                "-12\n" +
                "-11\n" +
                "-11\n" +
                "-9\n" +
                "+11\n" +
                "+14\n" +
                "-18\n" +
                "-16\n" +
                "+19\n" +
                "-13\n" +
                "-14\n" +
                "+7\n" +
                "-6\n" +
                "-9\n" +
                "-16\n" +
                "-5\n" +
                "+15\n" +
                "+1\n" +
                "-8\n" +
                "+15\n" +
                "+15\n" +
                "+12\n" +
                "+10\n" +
                "+16\n" +
                "-18\n" +
                "+3\n" +
                "-17\n" +
                "-10\n" +
                "-16\n" +
                "-15\n" +
                "-16\n" +
                "+1\n" +
                "+4\n" +
                "+14\n" +
                "-10\n" +
                "-6\n" +
                "+12\n" +
                "-9\n" +
                "-8\n" +
                "-20\n" +
                "-7\n" +
                "+4\n" +
                "+6\n" +
                "-22\n" +
                "+10\n" +
                "-15\n" +
                "-13\n" +
                "+15\n" +
                "-12\n" +
                "+3\n" +
                "-14\n" +
                "-17\n" +
                "+18\n" +
                "-20\n" +
                "-19\n" +
                "+14\n" +
                "+2\n" +
                "-9\n" +
                "-16\n" +
                "+11\n" +
                "-19\n" +
                "-1\n" +
                "-19\n" +
                "-3\n" +
                "-12\n" +
                "-16\n" +
                "-4\n" +
                "-2\n" +
                "+7\n" +
                "-12\n" +
                "+14\n" +
                "+4\n" +
                "+14\n" +
                "+13\n" +
                "+1\n" +
                "+4\n" +
                "+10\n" +
                "+14\n" +
                "-16\n" +
                "-2\n" +
                "-19\n" +
                "-8\n" +
                "-8\n" +
                "-22\n" +
                "-23\n" +
                "+10\n" +
                "+1\n" +
                "-14\n" +
                "-17\n" +
                "-17\n" +
                "-6\n" +
                "+9\n" +
                "-16\n" +
                "+4\n" +
                "+11\n" +
                "-14\n" +
                "+11\n" +
                "-17\n" +
                "-9\n" +
                "-8\n" +
                "-17\n" +
                "-13\n" +
                "+17\n" +
                "-15\n" +
                "-8\n" +
                "-16\n" +
                "-3\n" +
                "-5\n" +
                "-8\n" +
                "-17\n" +
                "+2\n" +
                "+5\n" +
                "+2\n" +
                "-19\n" +
                "-1\n" +
                "-12\n" +
                "+1\n" +
                "+16\n" +
                "-8\n" +
                "-19\n" +
                "-18\n" +
                "-2\n" +
                "-15\n" +
                "+7\n" +
                "-11\n" +
                "-6\n" +
                "+12\n" +
                "-14\n" +
                "-18\n" +
                "+15\n" +
                "-18\n" +
                "-12\n" +
                "+10\n" +
                "+12\n" +
                "-17\n" +
                "-13\n" +
                "-18\n" +
                "+13\n" +
                "-11\n" +
                "+15\n" +
                "-9\n" +
                "+8\n" +
                "+11\n" +
                "-20\n" +
                "+17\n" +
                "+9\n" +
                "+18\n" +
                "-29\n" +
                "+3\n" +
                "-14\n" +
                "-14\n" +
                "+2\n" +
                "-12\n" +
                "-5\n" +
                "-19\n" +
                "-19\n" +
                "-16\n" +
                "-15\n" +
                "+13\n" +
                "-8\n" +
                "-3\n" +
                "-17\n" +
                "-4\n" +
                "-9\n" +
                "+17\n" +
                "-12\n" +
                "+17\n" +
                "-10\n" +
                "+22\n" +
                "+6\n" +
                "-9\n" +
                "+6\n" +
                "-5\n" +
                "+17\n" +
                "+17\n" +
                "-5\n" +
                "-16\n" +
                "-16\n" +
                "-13\n" +
                "-13\n" +
                "+5\n" +
                "+6\n" +
                "-24\n" +
                "-3\n" +
                "-16\n" +
                "-12\n" +
                "+7\n" +
                "+18\n" +
                "-4\n" +
                "+13\n" +
                "-8\n" +
                "+13\n" +
                "+8\n" +
                "+13\n" +
                "-18\n" +
                "-5\n" +
                "-14\n" +
                "+17\n" +
                "-11\n" +
                "+1\n" +
                "-21\n" +
                "-13\n" +
                "-10\n" +
                "-16\n" +
                "+4\n" +
                "+16\n" +
                "-18\n" +
                "+13\n" +
                "-19\n" +
                "-10\n" +
                "-2\n" +
                "+7\n" +
                "-23\n" +
                "+8\n" +
                "-3\n" +
                "-2\n" +
                "-36\n" +
                "-5\n" +
                "-6\n" +
                "+10\n" +
                "-19\n" +
                "+11\n" +
                "-19\n" +
                "+7\n" +
                "+17\n" +
                "+13\n" +
                "-6\n" +
                "+12\n" +
                "-3\n" +
                "+14\n" +
                "+11\n" +
                "+18\n" +
                "+7\n" +
                "+13\n" +
                "+4\n" +
                "+19\n" +
                "-1\n" +
                "+12\n" +
                "+1\n" +
                "-5\n" +
                "-6\n" +
                "-6\n" +
                "+1\n" +
                "+2\n" +
                "+7\n" +
                "-14\n" +
                "-3\n" +
                "-2\n" +
                "+33\n" +
                "+14\n" +
                "+25\n" +
                "+28\n" +
                "+8\n" +
                "+8\n" +
                "+11\n" +
                "+19\n" +
                "-6\n" +
                "+12\n" +
                "-16\n" +
                "-13\n" +
                "-9\n" +
                "+7\n" +
                "-2\n" +
                "+9\n" +
                "-19\n" +
                "-19\n" +
                "+12\n" +
                "-8\n" +
                "+26\n" +
                "-16\n" +
                "-16\n" +
                "+19\n" +
                "+18\n" +
                "+19\n" +
                "-18\n" +
                "+15\n" +
                "-10\n" +
                "-2\n" +
                "+8\n" +
                "-5\n" +
                "+1\n" +
                "-9\n" +
                "-25\n" +
                "+7\n" +
                "+16\n" +
                "+17\n" +
                "+12\n" +
                "+7\n" +
                "+3\n" +
                "+2\n" +
                "-16\n" +
                "+30\n" +
                "+4\n" +
                "+5\n" +
                "-13\n" +
                "-14\n" +
                "-16\n" +
                "+7\n" +
                "-12\n" +
                "+18\n" +
                "+6\n" +
                "+25\n" +
                "+24\n" +
                "+1\n" +
                "+9\n" +
                "+6\n" +
                "-3\n" +
                "-11\n" +
                "+20\n" +
                "-2\n" +
                "+18\n" +
                "+12\n" +
                "+18\n" +
                "-11\n" +
                "-2\n" +
                "+15\n" +
                "+8\n" +
                "-11\n" +
                "-16\n" +
                "-6\n" +
                "+20\n" +
                "+11\n" +
                "+11\n" +
                "+16\n" +
                "+2\n" +
                "+18\n" +
                "+12\n" +
                "-17\n" +
                "+12\n" +
                "+11\n" +
                "-9\n" +
                "+16\n" +
                "+8\n" +
                "-10\n" +
                "-7\n" +
                "+19\n" +
                "+2\n" +
                "+13\n" +
                "+12\n" +
                "-20\n" +
                "-25\n" +
                "+2\n" +
                "+9\n" +
                "-13\n" +
                "+19\n" +
                "-4\n" +
                "-10\n" +
                "-17\n" +
                "+7\n" +
                "-9\n" +
                "+10\n" +
                "+15\n" +
                "-13\n" +
                "-25\n" +
                "-1\n" +
                "-10\n" +
                "+13\n" +
                "-12\n" +
                "+7\n" +
                "-18\n" +
                "-7\n" +
                "-17\n" +
                "+9\n" +
                "-4\n" +
                "-17\n" +
                "-11\n" +
                "-7\n" +
                "-5\n" +
                "-1\n" +
                "-16\n" +
                "+14\n" +
                "+20\n" +
                "-13\n" +
                "+42\n" +
                "-25\n" +
                "-27\n" +
                "-39\n" +
                "+12\n" +
                "-41\n" +
                "+3\n" +
                "+19\n" +
                "-2\n" +
                "-23\n" +
                "-12\n" +
                "-48\n" +
                "-35\n" +
                "+6\n" +
                "-116\n" +
                "+16\n" +
                "+18\n" +
                "-2\n" +
                "+7\n" +
                "-11\n" +
                "-40\n" +
                "+41\n" +
                "-155\n" +
                "+5\n" +
                "+125\n" +
                "-238\n" +
                "-1\n" +
                "-63346\n" +
                "-9\n" +
                "-18\n" +
                "-3\n" +
                "-11\n" +
                "+13\n" +
                "-4\n" +
                "-3\n" +
                "-4\n" +
                "-3\n" +
                "+23\n" +
                "+11\n" +
                "+14\n" +
                "+12\n" +
                "+3\n" +
                "+7\n" +
                "+1\n" +
                "-18\n" +
                "+15\n" +
                "-7\n" +
                "-15\n" +
                "-1\n" +
                "-9\n" +
                "+14\n" +
                "-10\n" +
                "-22\n" +
                "-1\n" +
                "-24\n" +
                "-13\n" +
                "+6\n" +
                "-14\n" +
                "-7\n" +
                "-8\n" +
                "-7\n" +
                "-1\n" +
                "-5\n" +
                "+9\n" +
                "+6\n" +
                "+19\n" +
                "+13\n" +
                "+3\n" +
                "-19\n" +
                "-13\n" +
                "-15\n" +
                "-2\n" +
                "+15\n" +
                "+3\n" +
                "+24\n" +
                "+26\n" +
                "+72\n" +
                "-16\n" +
                "+14\n" +
                "+16\n" +
                "+17\n" +
                "+14\n" +
                "-4\n" +
                "-3\n" +
                "+10\n" +
                "+3\n" +
                "+11\n" +
                "+12\n" +
                "+15\n" +
                "+9\n" +
                "+12\n" +
                "+5\n" +
                "+11\n" +
                "-35\n" +
                "-23\n" +
                "+11\n" +
                "-10\n" +
                "-5\n" +
                "+3\n" +
                "-15\n" +
                "-15\n" +
                "+128514\n";
        var result = taskOne(rawInput.split("\n"));
        System.out.println(result);
        var result2 = taskTwo(rawInput.split("\n"));
        System.out.println(result2);
	// write your code here
    }
    static private int taskOne(String[] input) {
        return Arrays.stream(input).mapToInt(DayOne::extractNumber).sum();
    }

    static private int taskTwo(String[] input) {
        var frequencySet = new HashSet<Integer>();
        int rollingFrequency = 0;
        while(true) {
            for(var s : input) {
                rollingFrequency += extractNumber(s);
                if(!frequencySet.add(rollingFrequency)){
                    return rollingFrequency;
                }
            }
        }
    }

    static private int extractNumber(String in) {
        return Integer.parseInt(in.charAt(0) == '+' ? in.substring(1) : in);
    }
}
