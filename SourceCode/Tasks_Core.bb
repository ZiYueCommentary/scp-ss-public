
; ~ Task Constants

Const TASK_STATUS_NEW = 0
Const TASK_STATUS_ALREADY = 1
Const TASK_STATUS_END = 2
Const TASK_STATUS_FAILED = 3
Const TASK_STATUS_CANCELED = 4
Const TASK_STATUS_UPDATED = 5
Const TASK_RENDER_TIME = 70*5

; ~ Tasks Themselves

; ~ [STORY MODE]
Const TASK_GO_TO_TRAM = 0
Const TASK_FINDWAY_START = 1
Const TASK_FINDWAY_START_KEY = 2
Const TASK_FINDWAY_EZDOOR = 3
Const TASK_FINDWAY_EZDOOR_ALT = 4
Const TASK_FIND_MEDKIT = 5
Const TASK_FIND_ROOM3_CT = 6
Const TASK_FIND_ROOM3_CT_FUSEBOXES = 7
Const TASK_TURN_ON_ROOM3_CT_GENERATOR = 8
Const TASK_ESCAPE_106 = 9
Const TASK_COME_BACK_TO_GUARD = 10
Const TASK_FIND_REACTOR = 11
Const TASK_TURN_ON_REACTOR = 12
Const TASK_STOP_REACTOR = 13
Const TASK_COME_BACK_TO_GUARD_2 = 14
Const TASK_LAUNCH_ROCKET = 15
Const TASK_GET_TOPSIDE = 16
Const TASK_FIND_ROOM2_SL = 17
Const TASK_TURN_ON_ROOM2_SL = 18
Const TASK_COME_BACK_TO_CORE = 19
Const TASK_FIND_ROOM1_O5 = 20
Const TASK_SEARCH_FOR_ROOM3_CT = 21
Const TASK_SEARCH_FOR_ROOM2_MT = 22
Const TASK_SEARCH_FOR_CONT_079 = 23
Const TASK_SEARCH_FOR_GENERATOR = 24
Const TASK_FIND_AREA_076 = 25
Const TASK_FIND_KEY_IN_076 = 26
Const TASK_DEFEAT_076 = 27
Const TASK_COME_BACK_TO_GUARD_3 = 28
Const TASK_COME_BACK_TO_JANITOR = 29
Const TASK_FIND_CAVES = 30
Const TASK_SEARCH_CAVES = 31
Const TASK_COME_BACK_TO_O5 = 32
Const TASK_SEARCH_O5 = 33
Const TASK_FIND_PERSONNEL_OFFICES = 34
Const TASK_SEARCH_PERSONNEL_OFFICES = 35
Const TASK_HELP_GUARD% = 36
Const TASK_FIND_008% = 37
Const TASK_CLOSE_008% = 38
Const TASK_FIND_409% = 39
Const TASK_CLOSE_409% = 40
Const TASK_GO_TO_BCZ% = 41
Const TASK_COME_BACK_TO_O5_AGAIN = 42
Const TASK_SEARCH_O5_AGAIN = 43
Const TASK_SEARCH_FOR_HAZMAT = 44
Const TASK_FIND_WAY_CAVES = 45
; ~ [CLASSIC MODE]
Const TASK_CLASSIC_ARRIVE_AT_SITE = 50
Const TASK_CLASSIC_ENTER_SITE = 51
Const TASK_CLASSIC_CORE = 52
Const TASK_CLASSIC_CORE_FINDWAY = 53
Const TASK_CLASSIC_GO_TO_ZONE = 54
Const TASK_CLASSIC_CONTAIN_173 = 55
Const TASK_CLASSIC_CONTAIN_106 = 56

Type NewTask
	Field ID%
	Field txt$
	Field Status%
	Field Timer#
End Type

Function BeginTask.NewTask(ID%)
	Local t.NewTask
	
	For t = Each NewTask
		If t\ID = ID Then
			Return t
		EndIf
	Next
	
	t = New NewTask
	t\ID = ID
	Select t\ID
			
		; ~ Story Mode Tasks
			
		Case TASK_GO_TO_TRAM
			t\txt = GetLocalString("Tasks", "go_to_tram")
		Case TASK_FINDWAY_START
			t\txt = GetLocalString("Tasks", "find_way_start")
		Case TASK_FINDWAY_START_KEY
			t\txt = GetLocalString("Tasks", "find_way_start_key")
		Case TASK_FINDWAY_EZDOOR
			t\txt = GetLocalString("Tasks", "find_way_ez_door")
		Case TASK_FINDWAY_EZDOOR_ALT
			t\txt = GetLocalString("Tasks", "find_way_ez_door_alt")
		Case TASK_FIND_MEDKIT
			t\txt = GetLocalString("Tasks", "find_medkit")
		Case TASK_FIND_ROOM3_CT
			t\txt = GetLocalString("Tasks", "find_room3_ct")
		Case TASK_FIND_ROOM3_CT_FUSEBOXES
			t\txt = GetLocalStringR("Tasks", "find_all_fuseboxes",ecst\FusesAmount)
		Case TASK_TURN_ON_ROOM3_CT_GENERATOR
			t\txt = GetLocalString("Tasks", "turn_on_room3_ct_gen")
		Case TASK_ESCAPE_106
			t\txt = GetLocalString("Tasks", "escape_106")
		Case TASK_COME_BACK_TO_GUARD,TASK_COME_BACK_TO_GUARD_2,TASK_COME_BACK_TO_GUARD_3
			t\txt = GetLocalString("Tasks", "come_back_to_guard")
		Case TASK_FIND_REACTOR
			t\txt = GetLocalString("Tasks", "find_reactor")
		Case TASK_TURN_ON_REACTOR
			t\txt = GetLocalString("Tasks", "turn_on_reactor")
		Case TASK_STOP_REACTOR
			t\txt = GetLocalString("Tasks", "stop_reactor")
		Case TASK_LAUNCH_ROCKET
			t\txt = GetLocalString("Tasks", "launch_rocket")
		Case TASK_GET_TOPSIDE
			t\txt = GetLocalString("Tasks", "get_topside")
		Case TASK_FIND_ROOM2_SL
			t\txt = GetLocalString("Tasks", "find_room2_sl")
		Case TASK_TURN_ON_ROOM2_SL
			t\txt = GetLocalString("Tasks", "turn_on_room2_sl")
		Case TASK_COME_BACK_TO_CORE
			t\txt = GetLocalString("Tasks", "come_back_to_core")
		Case TASK_FIND_ROOM1_O5
			t\txt = GetLocalString("Tasks", "find_room1_o5")
		Case TASK_SEARCH_FOR_ROOM3_CT
			t\txt = GetLocalString("Tasks", "search_room3_ct")
		Case TASK_SEARCH_FOR_ROOM2_MT
			t\txt = GetLocalString("Tasks", "search_room2_mt")
		Case TASK_SEARCH_FOR_CONT_079
			t\txt = GetLocalString("Tasks", "search_cont_079")
		Case TASK_SEARCH_FOR_GENERATOR
			t\txt = GetLocalString("Tasks", "search_gen")
		Case TASK_FIND_AREA_076
			t\txt = GetLocalString("Tasks", "find_area_076")
		Case TASK_FIND_KEY_IN_076
			t\txt = GetLocalString("Tasks", "find_key_in_076")
		Case TASK_DEFEAT_076
			t\txt = GetLocalString("Tasks", "defeat_076")
		Case TASK_COME_BACK_TO_JANITOR
			t\txt = GetLocalString("Tasks", "come_back_to_janitor")
		Case TASK_FIND_CAVES
			t\txt = GetLocalString("Tasks", "find_caves")
		Case TASK_SEARCH_CAVES
			t\txt = GetLocalString("Tasks", "search_caves")
		Case TASK_FIND_WAY_CAVES
			t\txt = GetLocalString("Tasks", "find_way_caves")
		Case TASK_COME_BACK_TO_O5,TASK_COME_BACK_TO_O5_AGAIN
			t\txt = GetLocalString("Tasks", "come_back_to_o5")
		Case TASK_SEARCH_O5,TASK_SEARCH_O5_AGAIN
			t\txt = GetLocalString("Tasks", "search_o5")
		Case TASK_FIND_PERSONNEL_OFFICES
			t\txt = GetLocalString("Tasks", "find_po")
		Case TASK_SEARCH_PERSONNEL_OFFICES
			t\txt = GetLocalString("Tasks", "search_po")
		Case TASK_HELP_GUARD
			t\txt = GetLocalString("Tasks", "help_guard")
		Case TASK_FIND_008
			t\txt = GetLocalString("Tasks", "find_008")
		Case TASK_CLOSE_008
			t\txt = GetLocalString("Tasks", "close_008")
		Case TASK_FIND_409
			t\txt = GetLocalString("Tasks", "find_409")
		Case TASK_CLOSE_409
			t\txt = GetLocalString("Tasks", "close_409")
		Case TASK_GO_TO_BCZ
			t\txt = GetLocalString("Tasks", "go_to_bcz")
		Case TASK_SEARCH_FOR_HAZMAT
			t\txt = GetLocalString("Tasks", "search_hazmat")
			
		; ~ Classic Mode Tasks
			
		Case TASK_CLASSIC_ARRIVE_AT_SITE
			t\txt = GetLocalString("Tasks", "classic_arrive_at_site")
		Case TASK_CLASSIC_ENTER_SITE
			t\txt = GetLocalString("Tasks", "classic_enter_site")
		Case TASK_CLASSIC_CORE
			t\txt = GetLocalString("Tasks", "classic_find_core")
		Case TASK_CLASSIC_CORE_FINDWAY
			t\txt = GetLocalString("Tasks", "classic_findway_core")
		Case TASK_CLASSIC_GO_TO_ZONE
			t\txt = GetLocalString("Tasks", "classic_go_to_zone")
		Case TASK_CLASSIC_CONTAIN_173
			t\txt = GetLocalString("Tasks", "classic_cont_173")
		Case TASK_CLASSIC_CONTAIN_106
			t\txt = GetLocalString("Tasks", "classic_cont_106")
	End Select
	t\Timer = TASK_RENDER_TIME
	t\Status = TASK_STATUS_NEW
	
	Return t
End Function

Function TaskExists(ID%)
	Local t.NewTask
	
	For t = Each NewTask
		If t\ID = ID Then
			Return True
		EndIf
	Next
	
	Return False
End Function

Function EndTask(ID%)
	Local t.NewTask
	
	For t = Each NewTask
		If t\ID = ID Then
			If t\Status <> TASK_STATUS_END And t\Status <> TASK_STATUS_FAILED Then
				t\Status = TASK_STATUS_END
				t\Timer = TASK_RENDER_TIME
			EndIf
			Exit
		EndIf
	Next
	
End Function

Function FailTask(ID%)
	Local t.NewTask
	
	For t = Each NewTask
		If t\ID = ID Then
			If t\Status <> TASK_STATUS_END And t\Status <> TASK_STATUS_FAILED And t\Status <> TASK_STATUS_CANCELED And t\Status <> TASK_STATUS_UPDATED Then
				t\Status = TASK_STATUS_FAILED
				t\Timer = TASK_RENDER_TIME
			EndIf
			Exit
		EndIf
	Next
	
End Function

Function CancelTask(ID%)
	Local t.NewTask
	
	For t = Each NewTask
		If t\ID = ID Then
			If t\Status <> TASK_STATUS_END And t\Status <> TASK_STATUS_FAILED And t\Status <> TASK_STATUS_CANCELED And t\Status <> TASK_STATUS_UPDATED Then
				t\Status = TASK_STATUS_CANCELED
				t\Timer = TASK_RENDER_TIME
			EndIf
			Exit
		EndIf
	Next
	
End Function

Function UpdateTask.NewTask(ID%)
	Local t.NewTask
	
	For t = Each NewTask
		If t\ID = ID Then
			t\Timer = TASK_RENDER_TIME
			t\Status = TASK_STATUS_UPDATED
			Return t
		EndIf
	Next
	
	Return Null
End Function

Function UpdateTasks()
	Local t.NewTask
	Local hasEndTask% = False
	Local hasFailedTask% = False
	Local hasCanceledTask% = False
	Local hasUpdatedTask% = False
	
	For t = Each NewTask
		If t\Status = TASK_STATUS_FAILED Then
			hasFailedTask = True
			hasEndTask = False
		ElseIf t\Status = TASK_STATUS_END And (Not hasFailedTask) Then
			hasEndTask = True
		ElseIf  t\Status = TASK_STATUS_UPDATED
			hasUpdatedTask = True
		ElseIf t\Status = TASK_STATUS_CANCELED And (Not hasFailedTask) Then
			hasCanceledTask = True
			hasEndTask = False
			Exit
		EndIf
	Next
	
	For t = Each NewTask
		If t\ID = TASK_FIND_ROOM3_CT_FUSEBOXES Then
			t\txt = GetLocalStringR("Tasks", "find_all_fuseboxes",Int(ecst\FusesAmount))
		EndIf
		If (hasEndTask And t\Status = TASK_STATUS_END) Lor (hasFailedTask And t\Status = TASK_STATUS_FAILED) Lor (hasCanceledTask And t\Status = TASK_STATUS_CANCELED) Lor (hasUpdatedTask And t\Status = TASK_STATUS_UPDATED) Lor ((Not hasEndTask) And (Not hasFailedTask) And (Not hasUpdatedTask) And (Not hasCanceledTask) And t\Status = TASK_STATUS_NEW) Then
			If t\Timer > 0.0 Then
				t\Timer = t\Timer - fps\Factor[0]
				If t\Timer <= 0.0 Then
					t\Timer = 0.0
					If t\Status = TASK_STATUS_END Lor t\Status = TASK_STATUS_CANCELED Lor t\Status = TASK_STATUS_FAILED Then
						Delete t
					Else
						t\Status = TASK_STATUS_ALREADY
					EndIf
				EndIf
			EndIf
		EndIf
	Next
	
End Function

Function DrawTasks()
	Local t.NewTask
	Local a#, x#, y#, hasNewTask%, hasEndTask%, hasFailedTask%, hasCanceledTask%, hasUpdatedTask%, globalTime#, txt$, atLeastOneTask%
	
	If HUDenabled And psp\IsShowingHUD Lor InvOpen Then
		hasNewTask = False
		globalTime = 0.0
		x = opt\GraphicWidth / 2
		y = opt\GraphicHeight / 4
		
		For t = Each NewTask
			If t\Status = TASK_STATUS_FAILED Then
				hasFailedTask = True
				hasEndTask = False
				hasNewTask = False
			ElseIf t\Status = TASK_STATUS_END And (Not hasFailedTask) Then
				hasEndTask = True
				hasNewTask = False
			ElseIf t\Status = TASK_STATUS_CANCELED Then
				hasCanceledTask = True
				hasEndTask = False
				hasNewTask = False
			ElseIf t\Status = TASK_STATUS_NEW And (Not hasEndTask) And (Not hasFailedTask) And (Not hasCanceledTask) Then
				hasNewTask = True
			ElseIf t\Status = TASK_STATUS_UPDATED And (Not hasEndTask) And (Not hasFailedTask) And (Not hasCanceledTask) Then
				hasUpdatedTask = True
			EndIf
		Next
		For t = Each NewTask
			If (t\Status = TASK_STATUS_FAILED And hasFailedTask) Lor (t\Status = TASK_STATUS_END And hasEndTask) Lor (t\Status = TASK_STATUS_CANCELED And hasCanceledTask) Lor (t\Status = TASK_STATUS_NEW And hasNewTask) Lor (t\Status = TASK_STATUS_UPDATED And hasUpdatedTask) Then
				If t\Timer > globalTime Then
					globalTime = t\Timer
				EndIf
			EndIf
		Next
		
		If hasEndTask Lor hasFailedTask Lor hasCanceledTask Lor hasNewTask Lor InvOpen Then
			If InvOpen Then
				txt = GetLocalString("Tasks", "inv_task")
			ElseIf hasFailedTask Then
				txt = GetLocalString("Tasks", "failed_task")
			ElseIf hasCanceledTask Then
				txt = GetLocalString("Tasks", "canceled_task")
			ElseIf hasEndTask Then
				txt = GetLocalString("Tasks", "end_task")
			ElseIf hasUpdatedTask Then
				txt = GetLocalString("Tasks", "updated_task")
			Else
				txt = GetLocalString("Tasks", "new_task")
			EndIf
			SetFont fo\Font[Font_Default_Medium]
			Color 0, 0, 0
			Text x + 1, y + 1, Upper(txt), True, False
			
			If InvOpen Then
				a = 255
			Else
				a = Min(globalTime / 2, 255)
			EndIf
			
			If (Not InvOpen) Then
				If hasEndTask Then
					Color 0,a,0
				ElseIf hasFailedTask Then
					Color a,0,0
				;ElseIf hasNewTask Then
				;	Color a,a,0           - Yellow color that pisses me off >:( ~ Karkusa
				Else
					Color a,a,a
				EndIf
			Else
				Color a,a,a
			EndIf
			
			;Color a, a * ((Not hasFailedTask) Lor (InvOpen)), a * ((Not hasFailedTask) Lor (InvOpen))
			Text x, y, Upper(txt), True, False
			
			y = y + 40.0
			SetFont fo\Font[Font_Default]
			
			atLeastOneTask = False
			For t = Each NewTask
				If (InvOpen And t\Status <> TASK_STATUS_END) Lor ((Not InvOpen) And ((hasEndTask And t\Status = TASK_STATUS_END) Lor (hasFailedTask And t\Status = TASK_STATUS_FAILED) Lor (hasCanceledTask And t\Status = TASK_STATUS_CANCELED) Lor (hasNewTask And t\Status = TASK_STATUS_NEW))) Then
					If t\Timer > 0.0 Lor InvOpen Then
						Color 0, 0, 0
						Text x + 1, y + 1, t\txt, True, False
						
						If InvOpen Then
							a = 255
						Else
							a = Min(t\Timer / 2, 255)
						EndIf
						Color a, a, a
						Text x, y, t\txt, True, False
						
						y = y + 20.0
						atLeastOneTask = True
					EndIf
				EndIf
			Next
			
			If InvOpen And (Not atLeastOneTask) Then
				txt = GetLocalString("Tasks", "none")
				
				Color 0, 0, 0
				Text x + 1, y + 1, txt, True, False
				
				Color 255, 255, 255
				Text x, y, txt, True, False
			EndIf
		EndIf
	EndIf
	
End Function

;~IDEal Editor Parameters:
;~C#Blitz3D