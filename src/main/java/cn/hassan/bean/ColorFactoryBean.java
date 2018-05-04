package cn.hassan.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created with IntelliJ IDEA.
 * Author: hassan
 * Date: 2018/5/4 22:25
 * Description:
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 判断当前的对象是否是单例的
     * true 单例的则容器中只存在一份
     * false 不是单例的容器中会存在多分，每次调用都会产生一个新的对象
     *
     * @return 是否是单利
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
