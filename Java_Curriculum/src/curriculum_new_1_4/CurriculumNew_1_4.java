package curriculum_new_1_4;

public class CurriculumNew_1_4 {

	public static void main(String[] args) {
		// Q1 下記9個をローカル変数として宣言のみしてください
		//		・バイト型・短整数型・整数型・長整数型
		// 	・単精度浮動小数点数型・倍精度浮動小数点数型
		//   	・文字型・文字列型
		//	 	・ブーリアン型 

		byte j; //バイト型
		short b; //短整数型
		int c; //整数型
		long d; //長整数型
		float e; //単精度浮動小数点数型
		double f; //倍精度浮動小数点数型
		char g; //文字型
		String h; //文字列型
		boolean i; //ブーリアン型
		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		j = 0;
		b = 0;
		c = 0;
		d = 0L;
		e = 0f;
		f = 0.0;
		g = '\u0000';
		h = null;
		i = false;

		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                 10
		// ・短整数型                 100
		// ・整数型                	 1000
		// ・長整数型                 10000
		// ・単精度浮動小数点数型   	 9.5
		// ・倍精度浮動小数点数型		 10.5
		// ・文字型                   a
		// ・文字列型              	 ハロー
		// ・ブーリアン型          	 true
		j = 10;
		b = 100;
		c = 1000;
		d = 10000;
		e = 9.5f;
		f = 10.5;
		g = 'a';
		h = "ハロー";
		i = true;
		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること

		// 11110
		// 20.0
		// a ハロー true
		// 11130.0                    数字を全て足す
		// 10000000000                小数点以外の数字を全てかける
		// 0.105                      10.5割る100をする
		// -90                        10引く100をする
		System.out.println(j + c + d + b);
		System.out.println(e + f);
		System.out.println(g + h + i);
		System.out.println(j + c + d + b + e + f);
		System.out.println(j * b * c * d);
		System.out.println(f / b);
		System.out.println(j - b);
		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		
		//		String num = "20";  Stringは文字の並びに使用
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

	}

}
