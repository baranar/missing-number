# 🔢 Eksik Elemanı Bulma Uygulaması (Java)

Bu küçük Java uygulaması, 100 elemanlı bir tam sayı listesinin kopyası üzerinden rastgele bir eleman silindiğinde, eksik olan bu elemanı bulmayı amaçlar.  
Algoritmanın temel mantığı, iki liste arasındaki toplam farkı kullanarak silinen elemanı tespit etmektir.

---

## 📌 Proje Açıklaması

Toplama işlemini yapan `sum()` metodunu ayrı tanımladım. Çünkü **SOLID** prensiplerinden ilki olan **Single Responsibility Principle (SRP)** ile uyumluluğa dikkat ettim.  
**SRP**'ye göre her sınıf ve metot, yalnızca **tek bir sorumluluğa** sahip olmalıdır.  
Ben burada elemanları toplama ve eksik elemanı bulma işlemlerini farklı metotlara ayırarak bu prensibe uygun bir yapı kurdum.

- `sum()` metodu yalnızca bir listenin elemanlarının toplamını hesaplamakla sorumludur.
- `missingNumber()` metodu ise sadece iki liste arasındaki toplam farkı üzerinden eksik elemanı bulmakla ilgilenir.

---

## 🧠 Eksik Sayıyı Bulma Mantığı

İki liste başlangıçta aynı elemanlara sahiptir. Ancak bir liste üzerinden rastgele bir eleman silinmiştir.  
Eğer bu iki listenin elemanlarının toplamı alınırsa, eksik olan eleman bu toplamlar arasındaki fark olarak bulunabilir.

```java
int missing = sum(list1) - sum(list2);
