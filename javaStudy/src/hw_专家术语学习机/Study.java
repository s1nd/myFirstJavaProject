package hw_专家术语学习机;

public class Study {
	public static void main(String []args) {
		//wordlist copy from http://m.bubuko.com/infodetail-534952.html
		   String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		   String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",  "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		   String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency","strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
		   byte wordOne = (byte)(Math.random()*wordListOne.length);
		   byte wordTwo = (byte)(Math.random()*wordListTwo.length);
		   byte wordThree = (byte)(Math.random()*wordListThree.length);
		   System.out.println(wordListOne[wordOne] + " " + wordListTwo[wordTwo]  + " " + wordListThree[wordThree]);
	}
}
