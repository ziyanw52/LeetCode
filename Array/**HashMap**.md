**HashMap**

>插入：使用 put(key, value) 方法将键值对插入 HashMap 中。
获取：使用 get(key) 方法，通过键获取对应的值。
删除：使用 remove(key) 方法，通过键删除对应的键值对。
判断键是否存在：使用 containsKey(key) 方法来检查 HashMap 中是否包含特定的键。
---

>迭代和遍历：
可以通过 keySet() 方法获取所有的键的集合，然后对集合进行迭代。
也可以通过 entrySet() 方法获取包含键值对的集合，然后对这些键值对进行迭代。

*创建 HashMap 实例：使用 new 关键字创建一个新的 HashMap 实例。你可以指定键和值的类型，例如：HashMap<KeyType, ValueType> hashMap = new HashMap<>();*