package jp.sample;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Commonsのライブラリを試す
 * 
 * @author kichi
 *
 */
public class CommonsSampleMain {
	public static void main(String[] args) throws Exception {
		Form form = new Form();
		form.setName("Mike");
		form.setAge(10);
		// getterの情報を出力する
		Map<String, String> map = BeanUtils.describe(form);
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("key : " + entry.getKey() + " : value : " + entry.getValue());
		}
		String word = null;
		word = StringUtils.defaultString(word);
		if (word.equals("")) {
			System.out.println("空文字に変換");
		} else {
			System.out.println("変換できていない（ここには来ないよ）");
		}
	}
}
