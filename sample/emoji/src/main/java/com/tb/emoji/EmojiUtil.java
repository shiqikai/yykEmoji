package com.tb.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmojiUtil {
    private static ArrayList<Emoji> emojiList;

    public static ArrayList<Emoji> getEmojiList() {
        if (emojiList == null) {
            emojiList = generateEmojis();
        }
        return emojiList;
    }

    private static ArrayList<Emoji> generateEmojis() {
        ArrayList<Emoji> list = new ArrayList<>();
        for (int i = 0; i < EmojiResArray.length; i++) {
            Emoji emoji = new Emoji();
            emoji.setImageUri(EmojiResArray[i]);
            emoji.setContent(EmojiTextArray[i]);
            list.add(emoji);
        }
        return list;
    }


    public static final int[] EmojiResArray = {
            R.drawable.d_aini,
            R.drawable.d_aoteman,
            R.drawable.d_baibai,
            R.drawable.d_beishang,
            R.drawable.d_bishi,
            R.drawable.d_bizui,
            R.drawable.d_chanzui,
            R.drawable.d_chijing,
            R.drawable.d_dahaqi,
            R.drawable.d_dalian,
            R.drawable.d_ding,
            R.drawable.d_doge,
            R.drawable.d_feizao,
            R.drawable.d_ganmao,
            R.drawable.d_guzhang,
            R.drawable.d_haha,
            R.drawable.d_haixiu,
            R.drawable.d_han,
            R.drawable.d_hehe,
            R.drawable.d_heixian,
            R.drawable.d_heng,
            R.drawable.d_huaxin,
            R.drawable.d_jiyan,
            R.drawable.d_keai,
            R.drawable.d_kelian,
            R.drawable.d_ku,
            R.drawable.d_kun,
            R.drawable.d_landelini,
            R.drawable.d_lei,
            R.drawable.d_madaochenggong,
            R.drawable.d_miao,
            R.drawable.d_nanhaier,
            R.drawable.d_nu,
            R.drawable.d_numa,
            R.drawable.d_numa,
            R.drawable.d_qian,
            R.drawable.d_qinqin,
            R.drawable.d_shayan,
            R.drawable.d_shengbing,
            R.drawable.d_shenshou,
            R.drawable.d_shiwang,
            R.drawable.d_shuai,
            R.drawable.d_shuijiao,
            R.drawable.d_sikao,
            R.drawable.d_taikaixin,
            R.drawable.d_touxiao,
            R.drawable.d_tu,
            R.drawable.d_tuzi,
            R.drawable.d_wabishi,
            R.drawable.d_weiqu,
            R.drawable.d_xiaoku,
            R.drawable.d_xiongmao,
            R.drawable.d_xixi,
            R.drawable.d_xu,
            R.drawable.d_yinxian,
            R.drawable.d_yiwen,
            R.drawable.d_youhengheng,
            R.drawable.d_yun,
            R.drawable.d_zhajipijiu,
            R.drawable.d_zhuakuang,
            R.drawable.d_zhutou,
            R.drawable.d_zuiyou,
            R.drawable.d_zuohengheng,
            R.drawable.f_geili,
            R.drawable.f_hufen,
            R.drawable.f_jiong,
            R.drawable.f_meng,
            R.drawable.f_shenma,
            R.drawable.f_v5,
            R.drawable.f_xi,
            R.drawable.f_zhi,
            R.drawable.h_buyao,
            R.drawable.h_good,
            R.drawable.h_haha,
            R.drawable.h_lai,
            R.drawable.h_ok,
            R.drawable.h_quantou,
            R.drawable.h_ruo,
            R.drawable.h_woshou,
            R.drawable.h_ye,
            R.drawable.h_zan,
            R.drawable.h_zuoyi,
            R.drawable.l_shangxin,
            R.drawable.l_xin,
            R.drawable.o_dangao,
            R.drawable.o_feiji,
            R.drawable.o_ganbei,
            R.drawable.o_huatong,
            R.drawable.o_lazhu,
            R.drawable.o_liwu,
            R.drawable.o_lvsidai,
            R.drawable.o_weibo,
            R.drawable.o_weiguan,
            R.drawable.o_yinyue,
            R.drawable.o_zhaoxiangji,
            R.drawable.o_zhong,
            R.drawable.w_fuyun,
            R.drawable.w_shachenbao,
            R.drawable.w_taiyang,
            R.drawable.w_weifeng,
            R.drawable.w_xianhua,
            R.drawable.w_xiayu,
            R.drawable.w_yueliang,
    };

    public static final String[] EmojiTextArray = {
            "[爱你]",
            "[奥特曼]",
            "[拜拜]",
            "[悲伤]",
            "[鄙视]",
            "[闭嘴]",
            "[馋嘴]",
            "[吃惊]",
            "[哈欠]",
            "[打脸]",
            "[顶]",
            "[doge]",
            "[肥皂]",
            "[感冒]",
            "[鼓掌]",
            "[哈哈]",
            "[害羞]",
            "[汗]",
            "[微笑]",
            "[黑线]",
            "[哼]",
            "[色]",
            "[挤眼]",
            "[可爱]",
            "[可怜]",
            "[酷]",
            "[困]",
            "[白眼]",
            "[泪]",
            "[马到成功]",
            "[喵喵]",
            "[男孩儿]",
            "[怒]",
            "[怒骂]",
            "[女孩儿]",
            "[钱]",
            "[亲亲]",
            "[傻眼]",
            "[生病]",
            "[草泥马]",
            "[失望]",
            "[衰]",
            "[睡]",
            "[思考]",
            "[太开心]",
            "[偷笑]",
            "[吐]",
            "[兔子]",
            "[挖鼻]",
            "[委屈]",
            "[笑cry]",
            "[熊猫]",
            "[嘻嘻]",
            "[嘘]",
            "[阴险]",
            "[疑问]",
            "[右哼哼]",
            "[晕]",
            "[炸鸡啤酒]",
            "[抓狂]",
            "[猪头]",
            "[最右]",
            "[左哼哼]",
            "[给力]",
            "[互粉]",
            "[囧]",
            "[萌]",
            "[神马]",
            "[威武]",
            "[喜]",
            "[织]",
            "[NO]",
            "[good]",
            "[haha]",
            "[来]",
            "[OK]",
            "[拳头]",
            "[弱]",
            "[握手]",
            "[耶]",
            "[赞]",
            "[作揖]",
            "[伤心]",
            "[心]",
            "[蛋糕]",
            "[飞机]",
            "[干杯]",
            "[话筒]",
            "[蜡烛]",
            "[礼物]",
            "[绿丝带]",
            "[围脖]",
            "[围观]",
            "[音乐]",
            "[照相机]",
            "[钟]",
            "[浮云]",
            "[沙尘暴]",
            "[太阳]",
            "[微风]",
            "[鲜花]",
            "[下雨]",
            "[月亮]",
    };

    static {
        emojiList = generateEmojis();
    }

    public static int calculateInSampleSize(BitmapFactory.Options options,
                                            int reqWidth, int reqHeight) {
        // 源图片的高度和宽度
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;
        if (height > reqHeight || width > reqWidth) {
            // 计算出实际宽高和目标宽高的比率
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);
            // 选择宽和高中最小的比率作为inSampleSize的值，这样可以保证最终图片的宽和高
            // 一定都会大于等于目标的宽和高。
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }
        return inSampleSize;
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {
        // 第一次解析将inJustDecodeBounds设置为true，来获取图片大小
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);
        // 调用上面定义的方法计算inSampleSize值
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        // 使用获取到的inSampleSize值再次解析图片
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }


    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static void handlerEmojiText(TextView comment, String content, Context context) throws IOException {
        SpannableStringBuilder sb = new SpannableStringBuilder(content);
        String regex = "\\[(\\S+?)\\]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        Iterator<Emoji> iterator;
        Emoji emoji = null;
        while (m.find()) {
            iterator = emojiList.iterator();
            String tempText = m.group();
            while (iterator.hasNext()) {
                emoji = iterator.next();
                if (tempText.equals(emoji.getContent())) {
                    //转换为Span并设置Span的大小
                    sb.setSpan(new ImageSpan(context, decodeSampledBitmapFromResource(context.getResources(), emoji.getImageUri()
                                    , dip2px(context, 18), dip2px(context, 18))),
                            m.start(), m.end(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    break;
                }
            }
        }
        comment.setText(sb);
    }
}
