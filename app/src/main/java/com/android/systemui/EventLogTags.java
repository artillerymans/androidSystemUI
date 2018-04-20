/* This file is auto-generated.  DO NOT MODIFY.
 * Source file: frameworks/base/packages/SystemUI/src/com/android/systemui/EventLogTags.logtags
 */

package com.android.systemui;;

/**
 * @hide
 */
public class EventLogTags {
  private EventLogTags() { }  // don't instantiate

  /** 36000 sysui_statusbar_touch (type|1),(x|1),(y|1),(disable1|1),(disable2|1) */
  public static final int SYSUI_STATUSBAR_TOUCH = 36000;

  /** 36001 sysui_heads_up_status (key|3),(visible|1) */
  public static final int SYSUI_HEADS_UP_STATUS = 36001;

  /** 36002 sysui_fullscreen_notification (key|3) */
  public static final int SYSUI_FULLSCREEN_NOTIFICATION = 36002;

  /** 36003 sysui_heads_up_escalation (key|3) */
  public static final int SYSUI_HEADS_UP_ESCALATION = 36003;

  /** 36004 sysui_status_bar_state (state|1),(keyguardShowing|1),(keyguardOccluded|1),(bouncerShowing|1),(secure|1),(currentlyInsecure|1) */
  public static final int SYSUI_STATUS_BAR_STATE = 36004;

  /** 36010 sysui_panelbar_touch (type|1),(x|1),(y|1),(enabled|1) */
  public static final int SYSUI_PANELBAR_TOUCH = 36010;

  /** 36020 sysui_notificationpanel_touch (type|1),(x|1),(y|1) */
  public static final int SYSUI_NOTIFICATIONPANEL_TOUCH = 36020;

  /** 36021 sysui_lockscreen_gesture (type|1),(lengthDp|1),(velocityDp|1) */
  public static final int SYSUI_LOCKSCREEN_GESTURE = 36021;

  /** 36030 sysui_quickpanel_touch (type|1),(x|1),(y|1) */
  public static final int SYSUI_QUICKPANEL_TOUCH = 36030;

  /** 36040 sysui_panelholder_touch (type|1),(x|1),(y|1) */
  public static final int SYSUI_PANELHOLDER_TOUCH = 36040;

  /** 36050 sysui_searchpanel_touch (type|1),(x|1),(y|1) */
  public static final int SYSUI_SEARCHPANEL_TOUCH = 36050;

  /** 36060 sysui_recents_connection (type|1),(user|1) */
  public static final int SYSUI_RECENTS_CONNECTION = 36060;

  public static void writeSysuiStatusbarTouch(int type, int x, int y, int disable1, int disable2) {
    android.util.EventLog.writeEvent(SYSUI_STATUSBAR_TOUCH, type, x, y, disable1, disable2);
  }

  public static void writeSysuiHeadsUpStatus(String key, int visible) {
    android.util.EventLog.writeEvent(SYSUI_HEADS_UP_STATUS, key, visible);
  }

  public static void writeSysuiFullscreenNotification(String key) {
    android.util.EventLog.writeEvent(SYSUI_FULLSCREEN_NOTIFICATION, key);
  }

  public static void writeSysuiHeadsUpEscalation(String key) {
    android.util.EventLog.writeEvent(SYSUI_HEADS_UP_ESCALATION, key);
  }

  public static void writeSysuiStatusBarState(int state, int keyguardshowing, int keyguardoccluded, int bouncershowing, int secure, int currentlyinsecure) {
    android.util.EventLog.writeEvent(SYSUI_STATUS_BAR_STATE, state, keyguardshowing, keyguardoccluded, bouncershowing, secure, currentlyinsecure);
  }

  public static void writeSysuiPanelbarTouch(int type, int x, int y, int enabled) {
    android.util.EventLog.writeEvent(SYSUI_PANELBAR_TOUCH, type, x, y, enabled);
  }

  public static void writeSysuiNotificationpanelTouch(int type, int x, int y) {
    android.util.EventLog.writeEvent(SYSUI_NOTIFICATIONPANEL_TOUCH, type, x, y);
  }

  public static void writeSysuiLockscreenGesture(int type, int lengthdp, int velocitydp) {
    android.util.EventLog.writeEvent(SYSUI_LOCKSCREEN_GESTURE, type, lengthdp, velocitydp);
  }

  public static void writeSysuiQuickpanelTouch(int type, int x, int y) {
    android.util.EventLog.writeEvent(SYSUI_QUICKPANEL_TOUCH, type, x, y);
  }

  public static void writeSysuiPanelholderTouch(int type, int x, int y) {
    android.util.EventLog.writeEvent(SYSUI_PANELHOLDER_TOUCH, type, x, y);
  }

  public static void writeSysuiSearchpanelTouch(int type, int x, int y) {
    android.util.EventLog.writeEvent(SYSUI_SEARCHPANEL_TOUCH, type, x, y);
  }

  public static void writeSysuiRecentsConnection(int type, int user) {
    android.util.EventLog.writeEvent(SYSUI_RECENTS_CONNECTION, type, user);
  }
}
