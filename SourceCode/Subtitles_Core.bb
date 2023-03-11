; ~ Subtitles IDs constants
;[Block]
Const ANNOUNCEMENT% = 0
Const FIRST_PERSON% = 1
Const SECOND_PERSON% = 2
Const THIRD_PERSON% = 3
;[End Block]

Type Subtitles
	Field Txt$[THIRD_PERSON + 1]
	Field Timer#[THIRD_PERSON + 1]
End Type

Function UpdateSubtitles%()
	If (Not opt\EnableSubtitles) Then Return
	
	Local sub.Subtitles
	Local ShouldDeleteSubtitles% = True, i%
	
	For sub.Subtitles = Each Subtitles
		If sub.Subtitles = First Subtitles Then
			For i = ANNOUNCEMENT To THIRD_PERSON
				If sub\Timer[i] > 0.0 Then
					ShouldDeleteSubtitles = False
					sub\Timer[i] = sub\Timer[i] - fps\Factor[0]
				EndIf
			Next
			If ShouldDeleteSubtitles Then Delete(sub)
		EndIf
	Next
End Function

Function RenderSubtitles%()
	If (Not opt\EnableSubtitles) Then Return
	
	Local sub.Subtitles
	Local i%
	
	For sub.Subtitles = Each Subtitles
		If sub.Subtitles = First Subtitles Then
			For i = ANNOUNCEMENT To THIRD_PERSON
				If sub\Timer[i] > 0.0 Then
					SetFont(fo\Font[Font_Default])
					Color(opt\SubColorR, opt\SubColorG, opt\SubColorB)
					Text(Viewport_Center_X,Viewport_Center_Y + (290 * MenuScale) - ((i * 20) * MenuScale), sub\Txt[i], True, False)
				EndIf
			Next
		EndIf
	Next
End Function

Const SubtitlesFile$ = "Data\Subtitles.ini"

Function ShowSubtitles%(Name$)
	CatchErrors("Uncaught (ShowSubtitles)")
	
	If (Not opt\EnableSubtitles) Then Return
	
	Local sub.Subtitles, CurrSub.Subtitles
	Local Loc% = GetINISectionLocation(SubtitlesFile, Name)
	Local Person% = GetINIString2(SubtitlesFile, Loc, "Person")
	Local LinesAmount% = GetINIInt2(SubtitlesFile, Loc, "LinesAmount")
	Local SubID%, i%
	
	Select Person
		Case 1
			;[Block]
			SubID = FIRST_PERSON
			;[End Block]
		Case 2
			;[Block]
			SubID = SECOND_PERSON
			;[End Block]
		Case 3
			SubID = THIRD_PERSON
			;[End Block]
		Default
			;[Block]
			SubID = ANNOUNCEMENT
			;[End Block]
	End Select
	
	For sub.Subtitles = Each Subtitles
		If sub\Txt[SubID] = "" Then
			CurrSub.Subtitles = sub.Subtitles
			Exit
		EndIf
	Next
	
	For i = 1 To LinesAmount
		If CurrSub = Null Then
			sub.Subtitles = New Subtitles
		Else
			sub.Subtitles = CurrSub.Subtitles
		EndIf
		sub\Txt[SubID] = GetINIString2(SubtitlesFile, Loc, "Txt" + i)
		sub\Timer[SubID] = 70.0 * GetINIFloat2(SubtitlesFile, Loc, "Timer" + i)
	Next
	
	CatchErrors("ShowSubtitles")
End Function

;~IDEal Editor Parameters:
;~C#Blitz3D