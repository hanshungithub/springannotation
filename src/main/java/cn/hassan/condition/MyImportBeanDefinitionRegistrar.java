package cn.hassan.condition;

import cn.hassan.bean.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created with IntelliJ IDEA.
 * Author: hassan
 * Date: 2018/5/4 21:46
 * Description:
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


    /**
     *
     * @param importingClassMetadata 配置类的元数据信息（包括各种注解）
     * @param registry 保存注册bean的类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean red = registry.containsBeanDefinition("cn.hassan.bean.Red");
        boolean blue = registry.containsBeanDefinition("cn.hassan.bean.Blue");

        if (red && blue) {
            BeanDefinition definition = new RootBeanDefinition(RainBow.class);
            registry.registerBeanDefinition("rainBow",definition);
        }
    }
}
