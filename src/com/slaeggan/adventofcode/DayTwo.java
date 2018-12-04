package com.slaeggan.adventofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DayTwo {
    public static void main(String[] args) {

        var rawInput = "asgwdcmbrkerohqoutfylvzpnx\n" +
                "asgwjcmbrkejihqoutfylvipne\n" +
                "asgwjcmbrkedihqoutvylizpnz\n" +
                "azgsjcmbrkedihqouifylvzpnx\n" +
                "asgwucmbrktddhqoutfylvzpnx\n" +
                "asgwocmbrkedihqoutfylvzivx\n" +
                "aqgwjcmbrkevihqvutfylvzpnx\n" +
                "tsgljcmbrkedihqourfylvzpnx\n" +
                "asgpjcmbrkedihqoutfnlvzsnx\n" +
                "astwjcmbrktdihqrutfylvzpnx\n" +
                "asgwjcmbrpedhhqoutfylvzynx\n" +
                "xsgwjcmbrkedieqowtfylvzpnx\n" +
                "asgwjcmbvkedihfoutnylvzpnx\n" +
                "asgwjcmtrkedihqouafylvzcnx\n" +
                "asgwjcmbrkedihqoutfylvxpvm\n" +
                "usgwjcmbrkedihqortfyuvzpnx\n" +
                "asgwjcmbrwedihqoutfylizpix\n" +
                "asgrjcvbrkedixqoutfylvzpnx\n" +
                "asgwjcmbrogdihqoutfelvzpnx\n" +
                "aggwjcmbrkesihqoutoylvzpnx\n" +
                "asgtjccbrkedihqoutfrlvzpnx\n" +
                "asgcucmbrbedihqoutfylvzpnx\n" +
                "esgwjcmbrkedihqsutfylvzcnx\n" +
                "asgwjcmbrkedrhqoutfyobzpnx\n" +
                "mngwjcbbrkedihqoutfylvzpnx\n" +
                "asgwjcrbrkeoihqyutfylvzpnx\n" +
                "apgwjcmbrkednhqogtfylvzpnx\n" +
                "asgwjcwbrkedihqoutfylplpnx\n" +
                "asgwjcmbrkfdihqoutfxlvzpyx\n" +
                "aegwjcmbrkedihqoutfylbxpnx\n" +
                "asgljcmbrkedixqoutaylvzpnx\n" +
                "aigwjcmbrkedihqouhfylvzpex\n" +
                "asgwjbmbrkedihqoutfylfzpnp\n" +
                "asgwjcmzroedihqoutcylvzinx\n" +
                "asgwjcwbrieuihqoutfylvzpnx\n" +
                "aagwjcmbrkedjhqdutfylvzpnx\n" +
                "ahgwjcmbrkedihqsutfylvzpfx\n" +
                "asgwjcmbrkedihzosttylvzpnx\n" +
                "aegwjcmbrkedioqnutfylvzpnx\n" +
                "asgwjcmbykidihqoutfysvzpnx\n" +
                "asgwkcxbrkeddhqoutfylvzpnx\n" +
                "ashwjcmbrkeeihqoutfylvzknx\n" +
                "acgwjcmbrqedihqoqtfylvzpnx\n" +
                "asgwjcmtrkedihooutfylszpnx\n" +
                "asgwjcmbrkmdihqfutrylvzpnx\n" +
                "asgwjcmbrkedihqoutjylvapnn\n" +
                "asgwjcmbwkedihqoutkylkzpnx\n" +
                "asgwjrmbrkedihqoutfycnzpnx\n" +
                "asgwtcmbrkedihqoqtfylozpnx\n" +
                "asgajcmbrkedihqoutuylvzpny\n" +
                "asgwjcmbykedihqoutfylfzpwx\n" +
                "asgwjcsbrkedihpoutfylvvpnx\n" +
                "hsdwjcmbrvedihqoutfylvzpnx\n" +
                "asgwjcmbrkedihqoutfdmszpnx\n" +
                "adgwjcmbrtidihqoutfylvzpnx\n" +
                "augwjcmbriedihqoutgylvzpnx\n" +
                "asgwjvmbreedihqoutfllvzpnx\n" +
                "asgwjcnbfkedihqoltfylvzpnx\n" +
                "asgwjcmbykddihqoutqylvzpnx\n" +
                "ajgwjcmbrkedihqoutfylvpvnx\n" +
                "asgwjcmbrkydihqoutfylszpnl\n" +
                "xsgwjcmbrkqdihqoutfylvkpnx\n" +
                "asgwjcmbrkedimqoutfklvzknx\n" +
                "csgwjbmbrkedihqoftfylvzpnx\n" +
                "asgwjcmbjkedihjoutfylvzpnn\n" +
                "asgwjcmprkedihqoulfalvzpnx\n" +
                "asgwjcmbrvediqqoutfyuvzpnx\n" +
                "asgwjambrkedhhqoutkylvzpnx\n" +
                "asgejcmbrkidihqoutfylvzpnk\n" +
                "hsiwjcmbrkedihqoutfylvzpnq\n" +
                "asswjczbrkedihqoutfylczpnx\n" +
                "asgwjnmbrkedyhzoutfylvzpnx\n" +
                "asgwscmbrkedihqoutfklvlpnx\n" +
                "asgwlcmbrktdihqoutfylvzpax\n" +
                "asfwjcmerkedihqoutfylvipnx\n" +
                "asgwjcmbrkeditqoeafylvzpnx\n" +
                "asgwgcmbrkesihqoutfylyzpnx\n" +
                "fsgwjcmbrkedihqouvfyavzpnx\n" +
                "asgwjcmbrpedwhqoutfylmzpnx\n" +
                "asgwjcmbrkzdzhqoucfylvzpnx\n" +
                "asgwjcmnrketmhqoutfylvzpnx\n" +
                "asgwjcmbrkedihxoutsylvzpnh\n" +
                "asgwjcobrkedihqoutfrlvzpox\n" +
                "asgwjcmbrkedihqootfylxzpox\n" +
                "asgjjcmcrkedihqoutfylmzpnx\n" +
                "lsgwjcmbrkedihqoutfyqvzunx\n" +
                "asgwjcmbrwedihqoutoylvzpnu\n" +
                "aszwjcmbtkedihqoutfylczpnx\n" +
                "asgwjcmbykedihqoutfylvgpex\n" +
                "asgijcmbrkedilqoutkylvzpnx\n" +
                "astwxcmzrkedihqoutfylvzpnx\n" +
                "akgwjcmbnkedihqfutfylvzpnx\n" +
                "asgwjcmbrqndivqoutfylvzpnx\n" +
                "asgwjrmbrleqihqoutfylvzpnx\n" +
                "asgwjcmbrkevihqoutfxlvzpvx\n" +
                "asbwjcmbrkedihqoutfelvwpnx\n" +
                "asewjcbbrkmdihqoutfylvzpnx\n" +
                "asgwjcmbrkeaihxoutfylpzpnx\n" +
                "asgwjzmbrkedihqrotfylvzpnx\n" +
                "asgwjcmbrkedihqoutgdxvzpnx\n" +
                "asgwjcwbrkmdihqoutfylvzlnx\n" +
                "asgwjcmbrkegihqoutfylrzpax\n" +
                "ajgwjcmbrkegihqhutfylvzpnx\n" +
                "asgwjcmbrzedihqhutfylvkpnx\n" +
                "asgwjcmwrkedihqouhfylkzpnx\n" +
                "aygwjcmbrkedihqoutfdlvzpnr\n" +
                "asgwjcmbrkednhqoutiylvypnx\n" +
                "aqgwjcmbrkezihqoutfylvzonx\n" +
                "bsgwjcmbrkedihqouhfylvzsnx\n" +
                "asgwjcmcrkedihqokyfylvzpnx\n" +
                "asgsjcmbrkewiyqoutfylvzpnx\n" +
                "asgwpcmbrkejihqoutfylzzpnx\n" +
                "asgwjumbrkedbeqoutfylvzpnx\n" +
                "asgwjcmbrkedihpoutqylqzpnx\n" +
                "awgwjcmbrredihqoutfylvzpna\n" +
                "asgwjsmbraedihqoutfylvzpvx\n" +
                "asgwncmbrkedihqoutfyljzrnx\n" +
                "asgwncmbrkedihqohtfylvzonx\n" +
                "asgwjcmbrkedihqlutfylvypux\n" +
                "asgwjcmbbkedihooutfylkzpnx\n" +
                "asghjcmsryedihqoutfylvzpnx\n" +
                "asgwjcmbrkevihqoulfzlvzpnx\n" +
                "asggjcmbrkedizqoutfylvzknx\n" +
                "asbwjcmbriedihqoutfylvmpnx\n" +
                "asgwjcmbrkedqbqoutfylvzenx\n" +
                "asgwjcmprkedihqoutfylvzknp\n" +
                "asgwjcmbrkerihqoutfwlvzpno\n" +
                "asgwjcmvrkesihqoutrylvzpnx\n" +
                "asgzjcmbrkedihqoutfnlvbpnx\n" +
                "asfwjcmbrkhdihqoutfylpzpnx\n" +
                "asgwjcmbskedihqdutfyyvzpnx\n" +
                "asgwjcmzrkedihqoutcylvzinx\n" +
                "asgwjcmbrkedibqoutfylvjonx\n" +
                "asgwjcmbrbedihqoutfylmzbnx\n" +
                "asgwjcmbrkedhhqoutmylczpnx\n" +
                "asgwjcmbrkbgihqoutzylvzpnx\n" +
                "asgwjcfbrkedihqoupfyxvzpnx\n" +
                "asiwjcmbzkedihqoutfyluzpnx\n" +
                "asvwjcmbrkedihqoitfylvzpns\n" +
                "asgwjcmxikedihqoutfyevzpnx\n" +
                "asgwjcmbrkedioqoutfylvzwox\n" +
                "asgwjcmbrkedivqoutjyuvzpnx\n" +
                "asgwjcmbkkydihqrutfylvzpnx\n" +
                "asgwjcmbrkxdiuqoutfylvopnx\n" +
                "asgwjcmbrkedihqouthylvzpra\n" +
                "asgwjcmbrzedimloutfylvzpnx\n" +
                "asgwjcmbrkedmhqoulfytvzpnx\n" +
                "asgwjcmbrkzdihqrutfysvzpnx\n" +
                "ssgwjcmxrkedihqoutftlvzpnx\n" +
                "asgwjcmbrkedihqoutfajvzynx\n" +
                "asgwjcmbrkqdihqxuufylvzpnx\n" +
                "asmwjcabrkedihqouxfylvzpnx\n" +
                "asgwjcmbrkeeihqoatfycvzpnx\n" +
                "asgwjcjbrgedjhqoutfylvzpnx\n" +
                "asgljcmtrkedihqoutoylvzpnx\n" +
                "asgwjcmbrkedigqouzfylvzpvx\n" +
                "ajgvjcmbkkedihqoutfylvzpnx\n" +
                "asgwjcmbrkedihqtugfygvzpnx\n" +
                "asgbjcmbrkedihboftfylvzpnx\n" +
                "asgwjwmbrkedihqontfylhzpnx\n" +
                "asgwjfmhrkedihqoutfylvqpnx\n" +
                "asgwjxmbrkedihqoutzylvzpnj\n" +
                "asgwjcrlrkedihqoutfylvzpsx\n" +
                "aygwjcmbrkedihqoutsylvzdnx\n" +
                "zsgwjcmbrkedihjogtfylvzpnx\n" +
                "asgwjxmbrkegihqoutfylvopnx\n" +
                "asgwjcmbrkedihqhutfylvzcnr\n" +
                "asgwicmbrkewihvoutfylvzpnx\n" +
                "asqwjcmbvkedihqoutfylvzknx\n" +
                "asgwjcmbrkedihqoktfyevzpnu\n" +
                "asgwjcmbrkudihqoutfylqzznx\n" +
                "asgwjdmbrkedihqoutfylvvdnx\n" +
                "asgwjcmbrkwmihqautfylvzpnx\n" +
                "asgwjcmbrxedihqoctfyldzpnx\n" +
                "asgwjdmbrkedjhqoutfyfvzpnx\n" +
                "asgwjcmtrzedihqoutfylvzpnm\n" +
                "bpgwjcmbrmedihqoutfylvzpnx\n" +
                "asgwjctbrkedihqoqtfynvzpnx\n" +
                "askhjcmbrkedihqoutfylvzrnx\n" +
                "asgkjcmblkehihqoutfylvzpnx\n" +
                "asgwjjmbrkedvhqoutfhlvzpnx\n" +
                "asgwjcmbrkedihqoupzylvzknx\n" +
                "asgwjcmbukedchqoutfylizpnx\n" +
                "askwjcmdrkedihqoutwylvzpnx\n" +
                "asgwjcmbtkcdihloutfylvzpnx\n" +
                "asgwjcmbrkedwgqoutvylvzpnx\n" +
                "asmwjcmbrkedihqoutfylozpnc\n" +
                "asgwjcmbriedibqouofylvzpnx\n" +
                "asgnjcmcrkedihqoupfylvzpnx\n" +
                "asgzjcmbrksdihqoutiylvzpnx\n" +
                "asgwjcrbkkedihqouafylvzpnx\n" +
                "asgwjcmbkkvdihqqutfylvzpnx\n" +
                "astwjcqbrkedihqoutfylvzpvx\n" +
                "asgwjcmhrkehihqoutfylvzvnx\n" +
                "asgwjcmbraeduhqoutmylvzpnx\n" +
                "asgwjcmbrkedihquutnylvzptx\n" +
                "asgwjcmbrkedilqoftfylvzpnz\n" +
                "akgwjmmbrkedihqoutfylxzpnx\n" +
                "asgwjcmbrkhxikqoutfylvzpnx\n" +
                "asgcjcmetkedihqoutfylvzpnx\n" +
                "fsgwjcmsrkedihooutfylvzpnx\n" +
                "gsgwjcmbrkedihdoutfylvzdnx\n" +
                "asgwtccbrkedihqoutfylvwpnx\n" +
                "asuwjcmbrkedihqcutfylvzpox\n" +
                "asgwacmbrkodihqlutfylvzpnx\n" +
                "asgwjcmbrkediuqoutfylqhpnx\n" +
                "asgwjcmbrkwdrhqoutfylvzpno\n" +
                "angwjcsblkedihqoutfylvzpnx\n" +
                "aigwjcmbyoedihqoutfylvzpnx\n" +
                "adgwjcmbrkedihqtutfylyzpnx\n" +
                "asgwjzmbrkeeihqputfylvzpnx\n" +
                "asgwjcmbrkwdihqoutfylvzpwc\n" +
                "asgpjcmbrkgdihqbutfylvzpnx\n" +
                "osgwjmmbrkedijqoutfylvzpnx\n" +
                "asgjjcmbrkkdihqoutfylvzynx\n" +
                "asgwjcnerwedihqoutfylvzpnx\n" +
                "azgwhcmbrkedicqoutfylvzpnx\n" +
                "asnwjcmbrsedihqoutfylvzpnm\n" +
                "hsgwjcmgrkedihqoutfilvzpnx\n" +
                "asgwscmbrkjdihqoutfylvzpnm\n" +
                "asgbjbmbrkedhhqoutfylvzpnx\n" +
                "aswwjcmtrkedihqjutfylvzpnx\n" +
                "asgwicmbrbedihqoutfylvzpnm\n" +
                "asgwjcubrkedihqoutfylvbnnx\n" +
                "asvwjcmbrkehihqoutfylhzpnx\n" +
                "gsgwjcmbrkedihqoutsklvzpnx\n" +
                "asgwjcubikedihqoitfylvzpnx\n" +
                "asgwjpmbskedilqoutfylvzpnx\n" +
                "aigwjcmbrxedihqoutyylvzpnx\n" +
                "asgwjcpbrkedihxoutfynvzpnx\n" +
                "asgwjcmbrkegihqoutfklvzcnx\n" +
                "asgwjvubrkedjhqoutfylvzpnx\n" +
                "asgwjcabrkedihqoutfyivzplx\n" +
                "asgwjcxbrkedihqgutfylvepnx\n" +
                "asgwlcmbrkedihqoutqylvwpnx\n" +
                "asgwjhmbrkydihqhutfylvzpnx\n" +
                "asgwjcmbrkedihqoutfylwzone\n" +
                "asgwycmbrkadihqoutuylvzpnx\n" +
                "asgwjcybrkedihqoftfylvzpne\n" +
                "asgwjcmnrkedihrodtfylvzpnx\n" +
                "asgwicmwrkedihqoutfyovzpnx\n" +
                "aqgwjlmbrkedilqoutfylvzpnx\n" +
                "asgwjcmzskwdihqoutfylvzpnx\n" +
                "asgwjcmdrkebihqoutfylvjpnx\n" +
                "asgwjcmbrkpdihqoutfylxzphx\n" +
                "asgwjcmbrkedixqoutlylfzpnx\n" +
                "asgwjcmbrkadihqoutfylvlpdx\n" +
                "asgejcmqrkedyhqoutfylvzpnx\n" +
                "asgwjcmvroedihpoutfylvzpnx\n" +
                "asgwjcmxrkedihqoutfyivzpmx\n";
        System.out.println(taskOne(rawInput.split("\n")));

        System.out.println(taskTwo(rawInput.split("\n")));
    }

    private static int taskOne(String[] inputs) {
        var register = new AnswerTupple();
        Arrays.stream(inputs).map(DayTwo::findTwoAndThreeGroups)
                .forEach(at ->
                {
                    register.twos += at.twos;
                    register.threes += at.threes;
                });
        return register.twos * register.threes;
    }

    private static AnswerTupple findTwoAndThreeGroups(String input) {
        var reply = new AnswerTupple();
        var testedChars = new HashSet<Character>();
        for (int i = 0; i < input.length() - 1; i++) {
            char findElem = input.charAt(i);
            if (!testedChars.add(findElem)) {
                continue;
            }
            int numMatches = otherCounter(input.substring(i + 1), findElem);
            if (numMatches == 1) {
                reply.twos = 1;
            } else if (numMatches == 2) {
                reply.threes = 1;
            }

            if (reply.twos == 1 && reply.threes == 1) {
                return reply;
            }
        }
        return reply;
    }

    static private String taskTwo(String[] input) {
        var theOnes = new ArrayList<String>();
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                var result = findCommon(input[i], input[j]);
                if (result.length() == (input[i].length() - 1)) {
                    theOnes.add(result);
                }
            }
        }
        System.out.println("Number of strings found: " + theOnes.size());
        return theOnes.get(0);
    }

    static private String findCommon(String left, String right) {
        var commonStringBuilder = new StringBuilder();
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) == right.charAt(i)) {
                commonStringBuilder.append(left.charAt(i));
            }
        }
        return commonStringBuilder.toString();
    }

    static private int otherCounter(String input, char elem) {
        return (int) input.chars().mapToObj(i -> (char) i).filter(c -> c == elem).count();
    }

    static class AnswerTupple {
        int twos;
        int threes;
    }

}
