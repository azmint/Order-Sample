package jp.personal.gi.order_sample.core.models.ユーザー;

import jp.personal.gi.order_sample.core.support.entity.Entity;

public class ユーザー extends Entity<ユーザーID> {
    private final ユーザー名 objユーザー名;
    private final メールアドレス objメールアドレス;
    private final パスワード objパスワード;

    public ユーザー(ユーザーID id, ユーザー名 objユーザー名, メールアドレス objメールアドレス, パスワード objパスワード) {
        super(id);
        this.objユーザー名 = objユーザー名;
        this.objメールアドレス = objメールアドレス;
        this.objパスワード = objパスワード;
    }

    @Override
    public String toString() {
        return "ユーザー{" +
                "id=" + id +
                ", objユーザー名=" + objユーザー名 +
                ", objメールアドレス=" + objメールアドレス +
                ", objパスワード=" + objパスワード +
                '}';
    }
}
