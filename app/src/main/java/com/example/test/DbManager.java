package com.example.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbManager extends SQLiteOpenHelper {

    private static final String dbName = "BiMatHanhTrinhTinhYeu.db";

    public DbManager(Context context) {
        super(context, dbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String qry="create table BMHTTY (id integer primary key autoincrement, chapter text, content text)";
        sqLiteDatabase.execSQL(qry);
        addContent();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS BMHTTY");
        onCreate(sqLiteDatabase);

    }

    public String addRecord (String Chapter, String Content){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("chapter", Chapter);
        cv.put("content", Content);
        long res = db.insert("BMHTTY", null,cv);

        if(res == -1)
            return "Failed";
        else
            return "Successfully";
    }

    public void addContent(){
        addRecord("1","Cuộc hôn nhân hạnh phúc là đích đến của một hành trình không bao giờ kết thúc, mọi người đều mơ ướcnhưng không phải ai cũng có được. Chúng ta đều biết con đường đi tìm hạnh phúc đã khó nhưng để đượchạnh phúc trong hôn nhân thì càng khó khăn hơn. Hôn nhân được hình thành từ cảm xúc đặc biệt được gọi là tình yêu, tuy nhiên, tình yêu và hôn nhân khác xa nhau. Lúc yêu, người ta có xu hướng sống bằng cảm xúc, còn khi kết hôn, người ta trở nên thực tế hơn, và tình yêu lúc bấy giờ là chất xúc tác để nuôi dưỡng hôn nhân. Và chỉ có người trong cuộc mới cảm nhận được hết thế nào là cuộc hôn nhân hạnh phúc thật sự.\n" +
                "\n" +
                "Hạnh phúc trong hôn nhân giống như giọt nước rơi vào lòng bàn tay, nếu nắm bàn tay lại, giọt nước ấy sẽ ấm dần lên, nhưng nếu cứ để mặc nhiên thì nó sẽ chảy xuống và biến mất. Điều này có nghĩa chúng ta phải biết\n" +
                "\n" +
                "nâng niu mối quan hệ hôn nhân bằng một thái độ, quan điểm tích cực. Sự gắn kết giữa hai người xa lạ với nhau không phải là chuyện đơn giản. Trong suốt quá trình chung sống, cả hai cùng phải đối diện, giải quyết rất nhiều sự kiện, những mâu thuẫn, biến cố xảy ra hàng ngày. Chỉ cần một trong hai người không khéo léo, không thật sự hiểu đúng mối quan hệ hôn nhân thì hạnh phúc sẽ vuột khỏi tầm tay.\n" +
                "\n" +
                "Vì sự phức tạp của mối quan hệ, vì sự mong đợi, hy vọng dành cho cuộc sống riêng tư ở mọi người quá lớn, và vì là nhu cầu tình cảm không thể thiếu trong đời sống, nên hôn nhân được rất nhiều người quan tâm.\n" +
                "\n" +
                "Đã là con người, hiếm có ai không ít nhất một lần rung động với cảm xúc yêu đương và khao khát được sống trọn vẹn cùng người mình yêu. Trong cuộc sống gia đình, càng hiếm có những đôi vợ chồng tránh được mâu thuẫn, xung đột. Vì thế, con đường đi đến cuộc hôn nhân hạnh phúc có thể nói là rất phức tạp, đa dạng, không tuân theo nguyên tắc hay tiêu chí cụ thể nào. Không ai có thể đảm bảo chắc chắn rằng tôi hay bạn hay một người nào đó có thể tìm thấy cuộc hôn nhân hạnh phúc trọn vẹn, dù trước đó đã được tư vấn, học hỏi và tự tích lũy một số kinh nghiệm.\n" +
                "\n" +
                "Trước khi kết hôn, đa số người ta thường xây dựng cho mình viễn cảnh hạnh phúc với một tình yêu êm đềm và lãng mạn. Nhưng khi bước vào đời sống hôn nhân, viễn cảnh ấy biến mất nhường chỗ cho những sự thật xô bồ của cuộc sống và cuối cùng, họ thường kết luận theo cách nhìn tiêu cực của riêng mình. Thật ra, chúng ta phải hiểu rằng một mối quan hệ hạnh phúc không bao giờ là điều có thể nhìn thấy và dễ dàng có được. Sự lầm tưởng, suy nghĩ sai lệch về hạnh phúc trong hôn nhân hoặc chủ quan trước thực tế cuộc sống sẽ khiến cuộc hôn nhân tan vỡ.\n" +
                "\n" +
                "Ai cũng có thể hiểu được nguyên nhân tại sao, ai cũng có thể tự rút ra chút ít kinh nghiệm cho riêng mình, nhưng khó ai đưa ra cho người khác một giải pháp phù hợp cho từng tình huống bởi vì mâu thuẫn trong quan hệ hôn nhân rất đa dạng và phức tạp, chỉ có người trong cuộc mới biết rõ nguyên nhân và cách giải quyết phù hợp, hiệu quả. Cùng với \"Bí quyết của thành công\" và \"Bí mật của hạnh phúc\", cuốn sách \"Bí mật hành trình của Tình Yêu\" ra đời bằng sự trải nghiệm thực tế của tác giả, tiến sĩ David Niven, một nhà tâm lý học, xã hội học và là giáo sư giảng dạy ở các trường đại học trên khắp nước Mỹ. Trong cuốn sách này, mỗi câu chuyện là một tình huống cụ thể, có cả tiêu cực lẫn tích cực, rất thực tế và đơn giản nhưng bài học nó đưa ra rất đáng để chúng ta suy ngẫm: \"Hôn nhân hạnh phúc là một mối quan hệ của hai người yêu nhau và biết sống vìnhau\".\n" +
                "\n" +
                "Tiến sĩ David Niven cũng phát hiện ra rằng, mặc cho những thay đổi đến chóng mặt của thế giới hiện đại, mặc cho khoảng cách thời gian giữa các thế hệ và sự khác biệt văn hóa giữa các vùng miền nhưng vấn đề cốt lõi xoay quanh nhu cầu tình cảm của con người trên khắp thế giới vẫn có rất nhiều điểm tương đồng với nhau. Đó là lý do vì sao cuốn sách này luôn hữu ích cho mọi người, dù bạn là ai, bạn làm gì, bạn bao nhiêu tuổi.\n" +
                "\n" +
                "Đúc kết từ thực tế của những cuộc hôn nhân, tác giả rút ra một số đặc điểm chung của mối quan hệ đặc biệtnày:\n" +
                "\n" +
                "• Hôn nhân hạnh phúc chứa đựng cả không gian riêng tư lẫn thế giới chung của cả hai người.\n" +
                "\n" +
                "• Phải kiên nhẫn, biết chia sẻ và thổ lộ những tâm tư tình cảm, biết tha thứ cho nhau những lỗi lầm.\n" +
                "\n" +
                "• Đồng lòng tạo dựng gia đình, hướng đến điều hay, cái đẹp.\n" +
                "\n" +
                "• Tin cậy và tôn trọng bản sắc riêng cũng như hiểu được điểm khác biệt của nhau.\n" +
                "\n" +
                "Bí mật hành trình của Tình Yêu là những câu chuyện đơn giản, chân thực và gần gũi trong cuộc sống mỗi người, nhưng không hẳn là đáp số cho những vấn đề cụ thể mà bạn đang gặp phải. Hãy đọc, suy nghĩ và tự tìm ra cho chính mình hướng giải quyết thiết thực nhất từ quyển sách này để có được một đời sống tình cảm hạnh phúc.");

    }

    public Cursor getContent(){
        String qry = "select * from BMHTTY";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor res = sqLiteDatabase.rawQuery(qry, null);
        return res;
    }
}
