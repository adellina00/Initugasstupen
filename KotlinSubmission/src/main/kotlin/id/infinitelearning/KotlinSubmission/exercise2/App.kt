package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini

for (i:Int in 1..100)
        if (i % 2 == 0){
    print(" - $i")
}
    }

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val mutableMap: MutableMap<String, String> = mutableMapOf()
mutableMap["Jan"] = "January"
mutableMap["Feb"] = "February"
mutableMap["Mar"] = "March"
mutableMap["Apr"] = "April"
mutableMap["May"] = "May"
mutableMap["Jun"] = "June"
mutableMap["Jul"] = "July"
mutableMap["Aug"] = "August"
mutableMap["Sep"] = "September"
mutableMap["Oct"] = "October"
mutableMap["Nov"] = "November"
mutableMap["Dec"] = "December"


for ((key, value) in mutableMap) {
    println("$key -> $value")
}
val sekarang = mutableMap["Oct"]
val lahir = mutableMap["Jan"]
println("Sekarang adalah bulan $sekarang, sedangkan bulan lahir saya adalah pada bulan $lahir")
}