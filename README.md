### Builder--Strategy---Proxy
Основне друге завдання полягало в розсилці емейлів <br>
Щоб надіслати емейл вам потрібно зареєструватись на сайті MailJet <br>
та прописати свій API KEY, API SECRET і емейл зареєстрований на сайті у файлі MailSender <br>
Емейл буде надісланий клієнту, в якому при створенні потрібно вказати електронну адресу <br>
MailSender використовує шаблон проектування Singleton <br>
Тільки один екземпляр цього класу створиться тільки при викликанні методу sendAll з MailBox (lazy evaluation) <br>
Це зроблено для того, щоб не створювати багато разів новий MailJetClient та автентифіковувати його <br>
