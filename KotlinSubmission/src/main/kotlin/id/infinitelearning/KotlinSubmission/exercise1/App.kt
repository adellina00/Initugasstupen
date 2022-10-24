package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile()
        {
            val firstName: String = "Adellina Sylvira"
            val lastName: String = "Azis"
            val age: Int = 5
            println("Nama depan saya $firstName")
            println("Dan nama belakang saya $lastName")
            println("Usia saya saat ini $age tahun")
        }
fun main() {
    var single: Boolean = true
    var tidakSingle: Boolean = false

    println("Status saya adalah = " + (single && tidakSingle))
    println("Status saya adalah = " + (single || tidakSingle))
    println("Status saya adalah = " + (!single))
    println("Status saya adalah = " + (single > tidakSingle))
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */


fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println(groupId)
    println(groupMember)
    println(session)
    return arrayOf(groupId, groupMember, session)

}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun main() {
    val grup: String = "Adel, Aristo, Darma, Deo, Icha"
    println("Anggota kami terdiri dari $grup")
    return "Adel"
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5

    return mentor.count() + countOfGroup;

}

fun main() {

    myProfile()
    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Grup 5", listOf("Adel", "Aristo", "Darma", "Deo", "Icha"), "Morning")

}