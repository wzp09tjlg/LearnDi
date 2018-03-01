# LearnDi
To learn kotlin luanage project

### 一：如何创建简单的kotlin工程
    1.在project modula下加入
    ----
     ext.kotlin_version = '1.2.21'
     和
     classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    ----
    2.在app modual中加入
    -----
    apply plugin: 'kotlin-android'
    和
    compile "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    -----
    3.编译
    
    二：如何创建kt的Activity及布局
     1.布局文件和使用java编写一样
     2.使用kotlin编写activity类
     ------
     class SomeActivity:AppComptActivity(){
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kt)
        val btnTest: Button = findViewById(R.id.btn_kt_test)
        btnTest.setOnClickListener {
            val intent = Intent(this.baseContext,OtherActivity::class.java)
            startActivity(intent)
        }
    }
     }
     ------
     3布局文件就是有一个button
     三：可以简单的运行使用了
