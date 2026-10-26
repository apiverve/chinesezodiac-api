/// Response models for the Chinese Zodiac API.

/// API Response wrapper.
class ChinesezodiacResponse {
  final String status;
  final dynamic error;
  final ChinesezodiacData? data;

  /// Set only when the current plan locks one or more fields; null otherwise.
  final PremiumInfo? premium;

  ChinesezodiacResponse({
    required this.status,
    this.error,
    this.data,
    this.premium,
  });

  factory ChinesezodiacResponse.fromJson(Map<String, dynamic> json) => ChinesezodiacResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? ChinesezodiacData.fromJson(json['data']) : null,
    premium: json['premium'] != null ? PremiumInfo.fromJson(json['premium']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
    if (premium != null) 'premium': premium!.toJson(),
  };
}

/// Describes fields the current plan does not unlock. Locked fields arrive as null
/// in [data], and [lockedFields] names them (nested ones use dot paths).
class PremiumInfo {
  final String? message;
  final String? upgradeUrl;
  final List<String>? lockedFields;

  PremiumInfo({this.message, this.upgradeUrl, this.lockedFields});

  factory PremiumInfo.fromJson(Map<String, dynamic> json) => PremiumInfo(
    message: json['message'] as String?,
    upgradeUrl: json['upgrade_url'] as String?,
    lockedFields: (json['locked_fields'] as List?)?.map((e) => e.toString()).toList(),
  );

  Map<String, dynamic> toJson() => {
    if (message != null) 'message': message,
    if (upgradeUrl != null) 'upgrade_url': upgradeUrl,
    if (lockedFields != null) 'locked_fields': lockedFields,
  };
}

/// Response data for the Chinese Zodiac API.

class ChinesezodiacData {
  String? date;
  num? zodiacYear;
  String? animal;
  String? animalChinese;
  String? element;
  String? elementChinese;
  String? elementColor;
  String? polarity;
  List<String>? traits;
  num? sexagenaryCyclePosition;
  String? fullName;
  String? chineseNewYear;

  ChinesezodiacData({
    this.date,
    this.zodiacYear,
    this.animal,
    this.animalChinese,
    this.element,
    this.elementChinese,
    this.elementColor,
    this.polarity,
    this.traits,
    this.sexagenaryCyclePosition,
    this.fullName,
    this.chineseNewYear,
  });

  factory ChinesezodiacData.fromJson(Map<String, dynamic> json) => ChinesezodiacData(
      date: json['date'],
      zodiacYear: json['zodiacYear'],
      animal: json['animal'],
      animalChinese: json['animalChinese'],
      element: json['element'],
      elementChinese: json['elementChinese'],
      elementColor: json['elementColor'],
      polarity: json['polarity'],
      traits: (json['traits'] as List?)?.cast<String>(),
      sexagenaryCyclePosition: json['sexagenaryCyclePosition'],
      fullName: json['fullName'],
      chineseNewYear: json['chineseNewYear'],
    );
}

class ChinesezodiacRequest {
  String date;

  ChinesezodiacRequest({
    required this.date,
  });

  Map<String, dynamic> toJson() => {
      'date': date,
    };
}
