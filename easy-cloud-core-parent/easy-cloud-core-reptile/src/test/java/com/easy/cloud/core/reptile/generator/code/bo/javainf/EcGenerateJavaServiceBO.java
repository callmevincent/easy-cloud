package com.easy.cloud.core.reptile.generator.code.bo.javainf;

import com.easy.cloud.core.generator.code.base.pojo.rule.EcGenerateRule;
import com.easy.cloud.core.generator.code.java.constant.EcCodeGenerateJavaConstant.EcClassCommentEndWith;
import com.easy.cloud.core.generator.code.java.constant.EcCodeGenerateJavaConstant.EcClassNameEndWith;
import com.easy.cloud.core.generator.code.java.pojo.bo.EcGenerateJavaInfBO;
import com.easy.cloud.core.generator.code.java.pojo.dto.EcGenerateJavaBaseDTO;

/**
 * 
 * <p>
 * 生成业务逻辑类
 * </p>
 *
 *
 * @author daiqi 创建时间 2018年3月27日 上午9:54:03
 */
public class EcGenerateJavaServiceBO extends EcGenerateJavaInfBO {

	public EcGenerateJavaServiceBO(EcGenerateJavaBaseDTO generateJavaBaseDTO, EcGenerateRule generateRule) {
		super(generateJavaBaseDTO, generateRule);

	}

	@Override
	protected void buildAnnotations() {
	}

	@Override
	protected void buildMethods() {
	}

	@Override
	protected String getClassNameEndWith() {
		return EcClassNameEndWith.SERVICE_INF;
	}

	@Override
	protected String getClassCommentEndWith() {
		return EcClassCommentEndWith.SERVICE_INF;
	}

}
