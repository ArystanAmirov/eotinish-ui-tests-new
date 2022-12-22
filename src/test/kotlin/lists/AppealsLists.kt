package lists

//Типы обращений
val listOfAppealTypes = listOf(
    "Запрос",                                                                       //0
//    "Запрос нотариуса",                                                             //1
//    "Запрос о рассекречивании сведений, отнесенных к государственным секретам",     //2
//    "Запросы адвокатов",                                                            //3
//    "Запросы о предоставлении информации",                                          //4
//    "Запросы средств массовой информации",                                          //5
//    "Запросы судебных исполнителей",                                                //6
//    "Заявление",                                                                    //7
//    "Заявление о реабилитации жертв массовых политических репрессий",               //8
//    "Отклик",                                                                       //9
//    "Предложение",                                                                  //10
    "Сообщение"                                                                     //11
)
//Типы жалоб
val listOfComplaintTypes = listOf(
    "Жалоба",                                                       //0
//    "Жалоба налогоплательщиков",                                    //1
//    "Жалоба налогоплательщиков, подлежащих налоговому мониторингу", //2
//    "Жалоба по вопросам оказания государственных услуг"             //3
)


//Дедлайны обращений и жалоб
val listOfAppealAndComplaintDeadlines : Map<String, Int> = linkedMapOf(
    "Жалоба" to 20,
    "Жалоба налогоплательщиков" to 30,
    "Жалоба налогоплательщиков, подлежащих налоговому мониторингу" to 45,
    "Жалоба по вопросам оказания государственных услуг" to 5,
    "Запрос" to 15,
    "Запрос нотариуса" to 10,
    "Запрос о рассекречивании сведений, отнесенных к государственным секретам" to 30,
    "Запросы адвокатов" to 10,
    "Запросы о предоставлении информации" to 15,
    "Запросы средств массовой информации" to 7,
    "Запросы судебных исполнителей" to 3,
    "Заявление" to 15,
    "Заявление о реабилитации жертв массовых политических репрессий" to 90,
    "Отклик" to 15,
    "Предложение" to 15,
    "Сообщение" to 15
)



//Так как у Заявлений причины, решения и характеры ответов отличаются от остальных видов обращений, разделил их на две группы
val listOfAppealsGroup1 = listOf(
    "Запрос",                                                                       //0
    "Запрос нотариуса",                                                             //1
    "Запрос о рассекречивании сведений, отнесенных к государственным секретам",     //2
    "Запросы адвокатов",                                                            //3
    "Запросы о предоставлении информации",                                          //4
    "Запросы средств массовой информации",                                          //5
    "Запросы судебных исполнителей",                                                //6
    "Отклик",                                                                       //7
    "Предложение",                                                                  //8
    "Сообщение"                                                                     //9
)
val listOfAppealsGroup2 = listOf(
    "Заявление",                                                                    //1
    "Заявление о реабилитации жертв массовых политических репрессий",               //2
)



//Айдишники обращений, которые нужны для прямого создания обращений в БД
val listOfAppealAndComplaintIDs : Map<String?, String?> = linkedMapOf(
    "Жалоба" to "da186314-311c-4ec5-a313-014890d2cc8c",                                                                     //0
    "Жалоба налогоплательщиков" to "6ba12453-fc93-4641-97e2-bc1d7b027d98",                                                  //1
    "Жалоба налогоплательщиков, подлежащих налоговому мониторингу" to "c8dfacee-0360-11ed-b939-0242ac120002",               //2
    "Жалоба по вопросам оказания государственных услуг" to "d101a6be-495f-4461-b24b-b9668f11938f",                          //3
    "Запрос" to "10edea47-2e28-4c45-923a-f2916211cddc",                                                                     //4
    "Запрос нотариуса" to "e90583d6-0360-11ed-b939-0242ac120002",                                                           //5
    "Запрос о рассекречивании сведений, отнесенных к государственным секретам" to "d04ec14a-0360-11ed-b939-0242ac120002",   //6
    "Запросы адвокатов" to "09f4c366-e732-4935-af9a-52bb0f5dae1a",                                                          //7
    "Запросы о предоставлении информации" to "078109c5-ce8c-4059-8503-b0de79196c13",                                        //8
    "Запросы средств массовой информации" to "90fc25ae-966d-467d-9063-d15430a129ae",                                        //9
    "Запросы судебных исполнителей" to "7e4ac70d-03f7-48f2-b12f-58fcb0584e71",                                              //10
    "Заявление" to "4b288b14-2a1c-4ef1-988f-adcbf3839983",                                                                  //11
    "Заявление о реабилитации жертв массовых политических репрессий" to "4bf7a272-0360-11ed-b939-0242ac120002",             //12
    "Отклик" to "84909946-3dcb-4f9a-b865-3812879ee661",                                                                     //13
    "Предложение" to "ea44d464-e547-447e-a859-86b59fe3405a",                                                                //14
    "Сообщение" to "ae30367e-bc6e-4fba-a9f0-0c6479a7fde1"                                                                   //15
)
