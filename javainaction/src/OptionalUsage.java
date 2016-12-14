import lambdainaction.chap10.Insurance;

import java.util.Optional;

/**
 * Created by gaolei on 2016/12/12.
 */
public class OptionalUsage {
        public static void main(String[] args) {
            //3种创建Optional对象的方法
            //1
            Optional<Insurance> insuranceOptional = Optional.<Insurance>empty();
            insuranceOptional.get();
            //2
            Optional<Insurance> insuranceOptional1 =  Optional.of(new Insurance());
            insuranceOptional1.get();
            //3 是前两种方法的总和(of/empty)
            Optional<Object> objectOptional = Optional.ofNullable(null);
            //没有值就构造，有insurance就返回insruance实例
            objectOptional.orElseGet(Insurance::new);


        }

}
