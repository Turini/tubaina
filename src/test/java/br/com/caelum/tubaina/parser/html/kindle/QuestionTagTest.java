package br.com.caelum.tubaina.parser.html.kindle;

import org.junit.Assert;
import org.junit.Test;

public class QuestionTagTest {

	@Test
	public void testQuestionTag() {
		String result = new QuestionTag().parse(chunk);
		Assert.assertEquals("<li class=\"question\">texto da questao</li>", result);
	}

	
}
