package com.itfinn.utils.base;

/**
 * Object 工具类
 *
 * @author itFinn.com
 * @date 2018-03-07 16:59
 */
public class ObjectUtils {

    /**
     * 功能：判断两个object是否为同一个引用。
     *
     * @param obj1 对象1
     * @param obj2 对象2
     * @return boolean 是返回true，否则返回false。
     */
    public static boolean equals(Object obj1, Object obj2) {
        return (obj1 != null) ? (obj1.equals(obj2)) : (obj2 == null);
    }

    /**
     * 功能：判断两个object的类型是否相同。
     *
     * @param object 第一个对象
     * @param thiz   第二个对象
     * @return boolean 是返回true，否则返回false。
     */
    public static boolean equalsType(Object object, Object thiz) {
        return (object != null) && (object.getClass().equals(thiz.getClass()));
    }
}
