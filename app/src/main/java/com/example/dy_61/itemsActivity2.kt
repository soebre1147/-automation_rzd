package com.example.dy_61

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class itemsActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items2)

        val itemlist: RecyclerView = findViewById(R.id.items_list)
        val items = arrayListOf<Item>()

        items.add(Item(1,"ду-1","НАТУРНЫЙ ЛИСТ ПОЕЗДА №.\n" +
                "\n" +
                "Ст.   формирования                                                        0000\t№ состава\n" +
                "00\tСт. назначения                                                     0000\tОсобые отметки\t\n" +
                "\t\n" +
                "\t\tШифр, прик.\tНегабарит\tЖивн.\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\tверх\t^оков.\t\n" +
                "\t\n" +
                "Голова\n" +
                "Хвост        °\tЧисло 0 0\tМесяц 0 0\n" +
                "\tЧасы 0 0\tМин.   0 0\tУсловная длина             0 0 0\tВес брутто             0 0 0 0\t0\t0\t0\t0\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\n" +
                "№№ по пор,\n" +
                "\n" +
                "\t№ вагона\tОтмет\u00ADка о\n" +
                "роли\u00ADковых подши\u00ADпниках\tВес груза в тоннах\tСтанция\n" +
                "назначения вагона (сетевая\n" +
                "разметка)\tОсобые отметки\tНаимено\u00ADвание груза\tПолучатель\t Количество  пломб\tТара вагона\tПримечание\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tмарш.\n" +
                "ГР , нераб. парк\tшифр, при\u00ADкрыт.\tнегаб., живн,, ДБ.НГ\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "00\t0000000\t0\t000\t0000\t0\t0\t0\t00000\t0000\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "66 1\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Колич. осей — всего\t\tКолич. гружен вагонов по до\u00ADрогам назнач.\t\t\t\n" +
                "В т. ч.  на ролик,   подш.\t\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\\- Состав, вес\tФизических    вагонов\tнерабоч, парка\tФизических    вагонов\tнерабоч, парка\t\n" +
                "N.   и длина N. поезда\tрабочего  парка\tВсего\t\n" +
                "\tрабочего   парка\tВсего\t\n" +
                "\t\n" +
                "Род           N.\n" +
                "вагона             >*\t2-осн.\t4-ОСН.\t6 — 8-осн.\t\n" +
                "\t\n" +
                "\t2-осн.\t4-осн.\t6 —8-осн.\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\tгруж 1 пор.\tгруж.| пор.\tгруж.\tпор.\tгруж.\tпор.\t4-осн.\t6—8 осн.\tгруж.\tпор.\tгруж.\tпор.\tгруж.|  пор.\tгруж\tпор.\t4-осн.\t6—8 осн.\t\n" +
                "Крытые\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Платформы\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Полувагоны\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Цистерны\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "В т. ч. битум\u00ADные\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Ледники\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Рефрижерат\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "В т. ч. АРВ\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Прочие\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "В том числе:\tцемен\u00ADтовозы\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\tконтей\u00ADнеров.\t\t—\t\t\t—\t—\t\t\t—\t\t_\t—\t\t\t—\t—\t\t\t—\t\n" +
                "Итого\t\t\t\t\t\t-\t\t\t\t\t\n" +
                "Кроме того физических единиц\tПассажирских вагонов\tИсдеиств   локом., мех. и др.\tПассажирских вагонов\tЬедейств. локом.    мех. и др\n" +
                "\n" +
                "\t-\t1\t-\t-\n" +
                "Бес поезда\tТара\tНетто\tЬ р у т т о\tТара\tНетто\tБрутто\n" +
                "в тоннах\t\t\t\t\t\t\n" +
                "Условная дли\u00ADна поезда\t\t\n" +
                "КОЛИЧ.   1.ОН-\n" +
                "тейн. в 3-т ис\u00ADчислении\tГруженых                                              Порожних\n" +
                "\tГруженых                                          Порожних\n" +
                "ДСП Оператор техконторы\tСтанция составления натурного листа Штемпель\tДСП Оператор гехконторм\tСтанция изменения натурного листа Штемпель\n"))
        items.add(Item(1,"ду-61","Бланк формы ДУ-61\n" +
                "\n" +
                "\n" +
                "^ КОРЕШОК ПРЕДУПРЕЖДЕНИЯ\n" +
                "\n" +
                "Предупреждение на поезд N_________ получил___________ 20____г.\n" +
                "\n" +
                "Машинист (помощник машиниста)_________________________________\n" +
                "\n" +
                "Станция___________(штемпель) \"__\" _______ 20 г.\n" +
                "\n" +
                "\n" +
                "ПРЕДУПРЕЖДЕНИЕ на поезд N________\n" +
                "\n" +
                "Место действия предупреждения (км, пикет, станция)\t\n" +
                "Время действия предупреждения\t\n" +
                "Скорость не более, км/ч\t\n" +
                "Остановиться у красного сигнала, а при его отсутствии следовать со скоростью не более, км/ч\t\n" +
                "Другие особые условия следования поезда\n" +
                "\n" +
                "1\t\n" +
                "2\t\n" +
                "3\t\n" +
                "4\t\n" +
                "5\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Дежурный по станции______________________________\n" ))

        itemlist.layoutManager = LinearLayoutManager(this)
        itemlist.adapter = ItemsAdapter(items,this)

    }
}
