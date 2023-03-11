;[Block]

Dim SizzSFX(1)
Global AirlockSFX%[2]
Global CIChn%
Global OpenDoorSFX%[4 * 3], CloseDoorSFX%[4 * 3]
Global DoorSparksSFX%
Global OpenGlassDoorSFX%
Global CloseGlassDoorSFX%
Global OpenOfficeDoorSFX%
Global CloseOfficeDoorSFX%
Global DoorBudgeSFX%
Global CloseEzDoorSFX%
Global OpenEzDoorSFX%
Global CloseHCzDoorSFX%
Global OpenHCzDoorSFX%
Global KeyCardSFX1
Global KeyCardSFX2
Global ScannerSFX1
Global ScannerSFX2
Global OpenDoorFastSFX
Global CautionSFX%
Global NuclearSirenSFX%
Global ExplosionSFX%
Global CameraSFX 
Global StoneDragSFX%
Global GunshotSFX%
Global Gunshot2SFX%
Global Gunshot3SFX%
Global BullethitSFX%
Global TeslaIdleSFX
Global TeslaActivateSFX
Global TeslaPowerUpSFX
Global MagnetUpSFX%, MagnetDownSFX
Global FemurBreakerSFX%
Global EndBreathCHN%
Global EndBreathSFX%
Global DecaySFX%[4]
Global BurstSFX
Global RustleSFX%[3]
Global Death914SFX%
Global Use914SFX%
Global TruckSFX%
Global DripSFX%[4]
Global LeverSFX%, LightSFX%
Global ButtGhostSFX%
Global RadioSFX[2 * 10]
Global RadioSquelch
Global RadioStatic
Global RadioBuzz
Global ElevatorBeepSFX, ElevatorMoveSFX
Global PickSFX%[6]
Global AmbientSFXCHN%, CurrAmbientSFX%
Global AmbientSFXAmount[7]
Global AmbientSFX%[6 * 15]
Global OldManSFX%[9]
Global Scp173SFX%[3]
Global HorrorSFX%[16]
Global IntroSFX%[5]
Global AlarmSFX%[11]
Global HeartBeatSFX
Global VomitSFX%
Global BreathSFX[2 * 5]
Global BreathCHN%
Global NeckSnapSFX%[3]
Global DamageSFX%[10]
Global MTFSFX%
Global CoughSFX%[3]
Global CoughCHN%, VomitCHN%
Global MachineSFX%
Global ApacheSFX
Global CurrStepSFX
Global SCRAMBLESFX%
Global SCRAMBLECHN%
Global LowBatterySFX%[2]
Global LowBatteryCHN%[2]
Global OmegaWarheadSFX%[2]
Global OmegaWarheadCHN%
Global NTF_PainSFX[8]
Global NTF_PainWeakSFX[2]
Global NTF_MaxAmbientSFX% = 39
Global NTF_AmbienceSFX
Global NTF_AmbienceCHN
Global NewElevatorMoveSFX1, NewElevatorMoveSFX2
Global SplashTextSFX%[3]
Global EquipmentSFX[2 * 8]
Global HDSWalkSFX[4]
Global HitSnd[3]

;[End Block]

;[Block]

Global SoundEmitter%
Global TempSounds%[10]
Global TempSoundCHN%
Global TempSoundIndex% = 0

;[End Block]

; ~ [MUSIC CONSTANTS]

;[Block]

Global Music$[74]

; ~ [AREAS]
Const MUS_INTRODUCTION% = 0
Const MUS_LCZ% = 1
Const MUS_HCZ% = 2
Const MUS_EZ% = 3
Const MUS_RCZ% = 4
Const MUS_BCZ% = 5
Const MUS_PD% = 6
Const MUS_PD_TRENCH% = 7
Const MUS_ROOM_MT% = 8
Const MUS_SURFACE% = 9
Const MUS_SEWERS% = 10
Const MUS_SEWERS_2% = 11
Const MUS_CAVE_AREAS% = 12
Const MUS_CONSTRUCTION_TUNNELS% = 13
; ~ [MENU RELATED]
Const MUS_CB% = 14
Const MUS_NTF% = 15
Const MUS_UE% = 16
Const MUS_CREDITS% = 17
; ~ [CONTAINMENT AREAS]
Const MUS_CONT_049% = 18
Const MUS_CONT_076% = 19
Const MUS_CONT_076_2% = 20
Const MUS_CONT_079% = 21
Const MUS_CONT_106% = 22
Const MUS_CONT_178% = 23
Const MUS_CONT_205% = 24
Const MUS_CONT_457% = 25
Const MUS_CONT_860% = 26
Const MUS_CONT_914% = 27
Const MUS_CONT_409% = 28
; ~ [CASE MUSIC]
Const MUS_CHASE_106% = 29
Const MUS_CHASE_106_2% = 30
Const MUS_CHASE_106_3% = 31
Const MUS_CHASE_860% = 32
Const MUS_CHASE_049% = 33
Const MUS_CYBER_CHASE% = 34
Const MUS_CYBER_CHASE_3% = 35
Const MUS_CYBER_CHASE_4% = 36
Const MUS_CYBER_CHASE_CONTINUE% = 37
; ~ [MENU]
Const MUS_MENU% = 38
Const MUS_MENU2% = 39
Const MUS_MENU3% = 40
Const MUS_MENU4% = 41
Const MUS_MENU5% = 42
; ~ [MISC AMBIENTS]
Const MUS_ELEVATOR% = 43
Const MUS_ELEVATOR_2% = 44
Const MUS_ELEVATOR_3% = 45
Const MUS_SUSPENSE% = 46
Const MUS_SAVE_ME_FROM% = 47
Const MUS_GOOD_KARMA% = 48
Const MUS_GENERATOR_CHASE% = 49
Const MUS_TURN_AROUND% = 50
; ~ [MULTIPLAYER]
Const MUS_MP_CONFLICT_ARISES% = 51
Const MUS_MP_IT_FOLLOWS% = 52
Const MUS_MP_IT_WATCHES% = 53
Const MUS_MP_IDLE% = 54
Const MUS_MP_FIGHT% = 55
; ~ [BOSS FIGHTS]
Const MUS_035_FIGHT% = 56
Const MUS_076_FIGHT% = 57
Const MUS_076_PAUSE% = 58
Const MUS_457_FIGHT% = 59
Const MUS_682_FIGHT% = 60
; ~ [BMS]
Const MUS_BMS_076_INTRO% = 61
Const MUS_BMS_076_FIGHT% = 62
Const MUS_BMS_076_PAUSE% = 63
Const MUS_BMS_682_INTRO% = 64
Const MUS_BMS_682_FIGHT% = 65
; ~ [SCPs]
Const MUS_SCP_1033RU% = 66
Const MUS_SCP_2935% = 67
; ~ [OTHERS]
Const MUS_INTRODUCTION_NTF% = 68
Const MUS_INTRODUCTION_NTF_2% = 69
Const MUS_INTRODUCTION_D% = 70
Const MUS_BLACK_MESA% = 71
Const MUS_THE_UNKNOWN% = 72
; ~ [MISC]
Const MUS_NULL% = 73

Music[MUS_LCZ] = "Facility_Areas\LCZ"
Music[MUS_HCZ] = "Facility_Areas\HCZ"
Music[MUS_EZ] = "Facility_Areas\EZ"
Music[MUS_RCZ] = "Facility_Areas\RCZ"
Music[MUS_BCZ] = "Facility_Areas\BCZ"
Music[MUS_PD] = "Facility_Areas\PD"
Music[MUS_PD_TRENCH] = "Facility_Areas\PDTrench"
Music[MUS_INTRODUCTION] = "Facility_Areas\Introduction"
Music[MUS_ROOM_MT] = "Facility_Areas\Maintenance"
Music[MUS_SURFACE] = "Facility_Areas\The_Surface"
Music[MUS_SEWERS] = "Facility_Areas\Sewers"
Music[MUS_SEWERS_2] = "Facility_Areas\Sewers_2"
Music[MUS_CAVE_AREAS] = "Facility_Areas\Cave_Areas"
Music[MUS_CONSTRUCTION_TUNNELS] = "Facility_Areas\Construction_Tunnels"

Music[MUS_ELEVATOR] = "Misc\Elevator_music"
Music[MUS_ELEVATOR_2] = "Misc\Elevator_music_2"
Music[MUS_ELEVATOR_3] = "Misc\Elevator_music_3"

Music[MUS_CONT_049] = "Containment_Areas\049"
Music[MUS_CONT_076] = "Containment_Areas\076"
Music[MUS_CONT_076_2] = "Containment_Areas\076_2"
Music[MUS_CONT_079] = "Containment_Areas\079"
Music[MUS_CONT_106] = "Containment_Areas\106"
Music[MUS_CONT_178] = "Containment_Areas\178"
Music[MUS_CONT_205] = "Containment_Areas\205"
Music[MUS_CONT_457] = "Containment_Areas\457"
Music[MUS_CONT_860] = "Containment_Areas\860"
Music[MUS_CONT_914] = "Containment_Areas\914"
Music[MUS_CONT_409] = "Containment_Areas\409"

Music[MUS_SCP_1033RU] = "SCPs\1033RU"
Music[MUS_SCP_2935] = "SCPs\2935"

Music[MUS_CHASE_049] = "Chase_Music\049_Chase"
Music[MUS_CHASE_106] = "Chase_Music\106_Chase"
Music[MUS_CHASE_106_2] = "Chase_Music\106_Chase_2"
Music[MUS_CHASE_106_3] = "Chase_Music\106_Chase_3"
Music[MUS_CHASE_860] = "Chase_Music\860_Chase"
Music[MUS_CYBER_CHASE] = "Chase_Music\Cyber_Chase"
Music[MUS_CYBER_CHASE_3] = "Chase_Music\Cyber_Chase_3"
Music[MUS_CYBER_CHASE_4] = "Chase_Music\Cyber_Chase_4"
Music[MUS_CYBER_CHASE_CONTINUE] = "Chase_Music\Cyber_Chase_Continue"
Music[MUS_GENERATOR_CHASE] = "Chase_Music\Generator_Music"

Music[MUS_MP_CONFLICT_ARISES] = "Multiplayer\Conflict_Arises"
Music[MUS_MP_IT_FOLLOWS] = "Multiplayer\It_Follows"
Music[MUS_MP_IT_WATCHES] = "Multiplayer\It_Watches"
Music[MUS_MP_IDLE] = "Multiplayer\Idle"
Music[MUS_MP_FIGHT] = "Multiplayer\Fight"

Music[MUS_035_FIGHT] = "Boss_Fights\035_Fight"
Music[MUS_076_FIGHT] = "Boss_Fights\076_Fight"
Music[MUS_076_PAUSE] = "Boss_Fights\076_Pause"
Music[MUS_457_FIGHT] = "Boss_Fights\457_Fight"
Music[MUS_682_FIGHT] = "Boss_Fights\682_Fight"

Music[MUS_BMS_076_INTRO] = "Boss_Fights\BMS\076_Intro"
Music[MUS_BMS_076_FIGHT] = "Boss_Fights\BMS\076_Fight"
Music[MUS_BMS_076_PAUSE] = "Boss_Fights\BMS\076_Pause"
Music[MUS_BMS_682_INTRO] = "Boss_Fights\BMS\682_Intro"
Music[MUS_BMS_682_FIGHT] = "Boss_Fights\BMS\682_Fight"

Music[MUS_MENU] = "Main_Menu\Menu"
Music[MUS_MENU2] = "Main_Menu\Menu2"
Music[MUS_MENU3] = "Main_Menu\Menu3"
Music[MUS_MENU4] = "Main_Menu\Menu4"
Music[MUS_MENU5] = "Main_Menu\Menu5"
Music[MUS_CB] = "Main_Menu\ContainmentBreach"
Music[MUS_NTF] = "Main_Menu\NineTailedFox"
Music[MUS_UE] = "Main_Menu\UltimateEdition"
Music[MUS_BLACK_MESA] = "Main_Menu\BlackMesa"
Music[MUS_CREDITS] = "Main_Menu\Credits"

Music[MUS_SUSPENSE] = "Misc\Suspense"
Music[MUS_SAVE_ME_FROM] = "Misc\SaveMeFrom"
Music[MUS_GOOD_KARMA] = "Misc\Good_Karma"
Music[MUS_TURN_AROUND] = "Misc\Turn_Around"
Music[MUS_THE_UNKNOWN] = "Misc\The_Unknown"

Music[MUS_INTRODUCTION_NTF] = "Facility_Areas\Introduction_NTF"
Music[MUS_INTRODUCTION_NTF_2] = "Facility_Areas\Introduction_NTF_2"
Music[MUS_INTRODUCTION_D] = "Facility_Areas\Introduction_D"

Global MusicCHN
Global CurrMusicVolume#=1.0,NowPlaying%=MUS_NULL,ShouldPlay%=opt\MainMenuMusic
Global CurrMusic% = 1

;[End Block]

;[Block]

Const STEP_FLOORS = 5, STEP_STATES = 2, STEP_IDS = 8

Global StepSFXSource%[STEP_FLOORS * STEP_STATES * STEP_IDS]

Function StepSFX(Floor, state%, id%)
	
	Return StepSFXSource[state + STEP_STATES * (id + Floor * STEP_IDS)]
	
End Function

Function SetStepSFX(Floor, state%, id%, value%)
	
	StepSFXSource[state + STEP_STATES * (id + Floor * STEP_IDS)] = value
	
End Function

Global Step2SFX%[6]

;[End Block]

Function PlaySound2%(SoundHandle%, cam%, entity%, range# = 10, volume# = 1.0)
	range# = Max(range, 1.0)
	Local soundchn% = 0
	
	If volume > 0 Then 
		Local dist# = EntityDistance(cam, entity) / range#
		If 1 - dist# > 0 And 1 - dist# < 1
			Local panvalue# = Sin(-DeltaYaw(cam,entity))
			soundchn% = PlaySound_Strict (SoundHandle)
			
			ChannelVolume(soundchn, volume# * (1 - dist#)*(opt\SFXVolume#*opt\MasterVol))
			ChannelPan(soundchn, panvalue)			
		EndIf
	EndIf
	
	Return soundchn
End Function

Function LoopSound2%(SoundHandle%, Chn%, cam%, entity%, range# = 10, volume# = 1.0)
	range# = Max(range,1.0)
	
	If volume>0 Then
		
		Local dist# = EntityDistance(cam, entity) / range#
		If 1 - dist# > 0 And 1 - dist# < 1 Then
			
			Local panvalue# = Sin(-DeltaYaw(cam,entity))
			
			If Chn = 0 Then
				Chn% = PlaySound_Strict (SoundHandle)
			Else
				If (Not ChannelPlaying(Chn)) Then Chn% = PlaySound_Strict (SoundHandle)
			EndIf
			
			ChannelVolume(Chn, volume# * (1 - dist#)*(opt\SFXVolume#*opt\MasterVol))
			ChannelPan(Chn, panvalue)
		EndIf
	Else
		If Chn <> 0 Then
			ChannelVolume (Chn, 0)
		EndIf 
	EndIf
	
	Return Chn
End Function

Function LoadTempSound(file$)
	If TempSounds[TempSoundIndex]<>0 Then FreeSound_Strict(TempSounds[TempSoundIndex])
	
	Local TempSound = LoadSound_Strict(file)
	TempSounds[TempSoundIndex] = TempSound
	
	TempSoundIndex=(TempSoundIndex+1) Mod 10
	
	Return TempSound
End Function

Function LoadEventSound(e.Events,file$,num%=0)
	
	If num=0 Then
		If e\Sound<>0 Then FreeSound_Strict e\Sound : e\Sound=0
		e\Sound=LoadSound_Strict(file)
		Return e\Sound
	Else If num=1 Then
		If e\Sound2<>0 Then FreeSound_Strict e\Sound2 : e\Sound2=0
		e\Sound2=LoadSound_Strict(file)
		Return e\Sound2
	EndIf
End Function

Function UpdateMusic()
	
	If ConsoleFlush Then
		If Not ChannelPlaying(ConsoleMusPlay) Then ConsoleMusPlay = PlaySound(ConsoleMusFlush)
	ElseIf (Not PlayCustomMusic)
		If NowPlaying <> ShouldPlay
			CurrMusicVolume# = Max(CurrMusicVolume - (fps\Factor[0] / 250.0), 0)
			If CurrMusicVolume = 0
				If NowPlaying<MUS_NULL
					StopStream_Strict(MusicCHN)
				EndIf
				NowPlaying = ShouldPlay
				MusicCHN = 0
				CurrMusic=0
			EndIf
		Else
			CurrMusicVolume = CurrMusicVolume + (opt\MusicVol - CurrMusicVolume) * (0.1*fps\Factor[0])
		EndIf
		
		If NowPlaying < MUS_NULL
			If CurrMusic = 0
				MusicCHN = StreamSound_Strict("SFX\Music\"+Music[NowPlaying]+".ogg",0.0,Mode)
				CurrMusic = 1
			EndIf
			SetStreamVolume_Strict(MusicCHN,((CurrMusicVolume*opt\MasterVol)*InFocus()))
		EndIf
	Else
		If fps\Factor[0] > 0 Lor OptionsMenu = 2 Then
			If (Not ChannelPlaying(MusicCHN)) Then MusicCHN = PlaySound_Strict(CustomMusic)
			ChannelVolume MusicCHN,1.0*aud\MusicVol
		EndIf
	EndIf
	
End Function 

Function PauseSounds()
	Local e.Events, n.NPCs, d.Doors, ne.NewElevator
	
	For e = Each Events
		If e\SoundCHN <> 0 Then
			If (Not e\SoundCHN_isStream) And ChannelPlaying(e\SoundCHN) Then
				PauseChannel(e\SoundCHN)
			Else
				SetStreamPaused_Strict(e\SoundCHN,True)
			EndIf
		EndIf
		If e\SoundCHN2 <> 0 Then
			If (Not e\SoundCHN2_isStream) And ChannelPlaying(e\SoundCHN2) Then
				PauseChannel(e\SoundCHN2)
			Else
				SetStreamPaused_Strict(e\SoundCHN2,True)
			EndIf
		EndIf
		If e\SoundCHN3 <> 0 Then
			If (Not e\SoundCHN3_isStream) And ChannelPlaying(e\SoundCHN3) Then
				PauseChannel(e\SoundCHN3)
			Else
				SetStreamPaused_Strict(e\SoundCHN3,True)
			EndIf
		EndIf
		If e\SoundCHN4 <> 0 Then
			If (Not e\SoundCHN4_isStream) And ChannelPlaying(e\SoundCHN4) Then
				PauseChannel(e\SoundCHN4)
			Else
				SetStreamPaused_Strict(e\SoundCHN4,True)
			EndIf
		EndIf		
	Next
	
	For n = Each NPCs
		If n\SoundChn <> 0 Then
			If (Not n\SoundChn_IsStream) And ChannelPlaying(n\SoundChn) Then
				PauseChannel(n\SoundChn)
			Else
				SetStreamPaused_Strict(n\SoundChn,True)
			EndIf
		EndIf
		If n\SoundChn2 <> 0 Then
			If (Not n\SoundChn2_IsStream) And ChannelPlaying(n\SoundChn2) Then
				PauseChannel(n\SoundChn2)
			Else
				SetStreamPaused_Strict(n\SoundChn2,True)
			EndIf
		EndIf
	Next	
	
	For d = Each Doors
		If d\SoundCHN <> 0 And ChannelPlaying(d\SoundCHN) Then
			PauseChannel(d\SoundCHN)
		EndIf
	Next
	
	If AmbientSFXCHN <> 0 And ChannelPlaying(AmbientSFXCHN) Then
		PauseChannel(AmbientSFXCHN)
	EndIf
	
	If BreathCHN <> 0 And ChannelPlaying(BreathCHN) Then
		PauseChannel(BreathCHN)
	EndIf
	
	If IntercomStreamCHN <> 0 Then
		SetStreamPaused_Strict(IntercomStreamCHN,True)
	EndIf
	
	If ScopeLowPowerChnSFX <> 0 And ChannelPlaying(ScopeLowPowerChnSFX) Then
		PauseChannel(ScopeLowPowerChnSFX)
	EndIf
	
	If GunCHN <> 0 And ChannelPlaying(GunCHN) Then
		PauseChannel(GunCHN)
	EndIf
	If GunCHN2 <> 0 And ChannelPlaying(GunCHN2) Then
		PauseChannel(GunCHN2)
	EndIf
	If ChatSFXCHN <> 0 And ChannelPlaying(ChatSFXCHN) Then
		PauseChannel(ChatSFXCHN)
	EndIf
	If NTF_ChatCHN1 <> 0 And ChannelPlaying(NTF_ChatCHN1) Then
		PauseChannel(NTF_ChatCHN1)
	EndIf
	If NTF_ChatCHN2 <> 0 And ChannelPlaying(NTF_ChatCHN2) Then
		PauseChannel(NTF_ChatCHN2)
	EndIf
	
	If SCRAMBLECHN <> 0 Then
		If ChannelPlaying(SCRAMBLECHN) Then PauseChannel(SCRAMBLECHN)
	EndIf
	
;	If OmegaWarheadCHN <> 0 Then
;		If ChannelPlaying(OmegaWarheadCHN) Then PauseChannel(OmegaWarheadCHN)
;	EndIf
	
	If CIChn <> 0 Then
		If ChannelPlaying(CIChn) Then PauseChannel(CIChn)
	EndIf
	
	If hds\SoundCHN <> 0 Then
		If ChannelPlaying(hds\SoundCHN) Then PauseChannel(hds\SoundCHN)
	EndIf
	
	For i = 0 To 1
		If LowBatteryCHN[i] <> 0 Then
			If ChannelPlaying(LowBatteryCHN[i]) Then PauseChannel(LowBatteryCHN[i])
		EndIf
	Next
	
	For ne = Each NewElevator
		If ne\soundchn <> 0 Then
			SetStreamPaused_Strict(ne\soundchn,True)
		EndIf
	Next
	
	If psp <> Null Then
		If psp\SoundCHN <> 0 And ChannelPlaying(psp\SoundCHN) Then
			PauseChannel(psp\SoundCHN)
		EndIf
	EndIf	
	
End Function

Function ResumeSounds()
	Local e.Events, n.NPCs, d.Doors, ne.NewElevator
	
	For e = Each Events
		If e\SoundCHN <> 0 Then
			If (Not e\SoundCHN_isStream) And ChannelPlaying(e\SoundCHN) Then
				ResumeChannel(e\SoundCHN)
			Else
				SetStreamPaused_Strict(e\SoundCHN,False)
			EndIf
		EndIf
		If e\SoundCHN2 <> 0 Then
			If (Not e\SoundCHN2_isStream) And ChannelPlaying(e\SoundCHN2) Then
				ResumeChannel(e\SoundCHN2)
			Else
				SetStreamPaused_Strict(e\SoundCHN2,False)
			EndIf
		EndIf
		If e\SoundCHN3 <> 0 Then
			If (Not e\SoundCHN3_isStream) And ChannelPlaying(e\SoundCHN3) Then
				ResumeChannel(e\SoundCHN3)
			Else
				SetStreamPaused_Strict(e\SoundCHN3,False)
			EndIf
		EndIf
		If e\SoundCHN4 <> 0 Then
			If (Not e\SoundCHN4_isStream) And ChannelPlaying(e\SoundCHN4) Then
				ResumeChannel(e\SoundCHN4)
			Else
				SetStreamPaused_Strict(e\SoundCHN4,False)
			EndIf
		EndIf
	Next
	
	For n = Each NPCs
		If n\SoundChn <> 0 Then
			If (Not n\SoundChn_IsStream) And ChannelPlaying(n\SoundChn) Then
				ResumeChannel(n\SoundChn)
			Else
				SetStreamPaused_Strict(n\SoundChn,False)
			EndIf
		EndIf
		If n\SoundChn2 <> 0 Then
			If (Not n\SoundChn2_IsStream) And ChannelPlaying(n\SoundChn2) Then
				ResumeChannel(n\SoundChn2)
			Else
				SetStreamPaused_Strict(n\SoundChn2,False)
			EndIf
		EndIf
	Next
	
	For d = Each Doors
		If d\SoundCHN <> 0 And ChannelPlaying(d\SoundCHN) Then
			ResumeChannel(d\SoundCHN)
		EndIf
	Next
	
	If AmbientSFXCHN <> 0 And ChannelPlaying(AmbientSFXCHN) Then
		ResumeChannel(AmbientSFXCHN)
	EndIf	
	
	If BreathCHN <> 0 And ChannelPlaying(BreathCHN) Then
		ResumeChannel(BreathCHN)
	EndIf
	
	If IntercomStreamCHN <> 0 Then
		SetStreamPaused_Strict(IntercomStreamCHN,False)
	EndIf
	
	If ScopeLowPowerChnSFX <> 0 And ChannelPlaying(ScopeLowPowerChnSFX) Then
		ResumeChannel(ScopeLowPowerChnSFX)
	EndIf
	
	If GunCHN <> 0 And ChannelPlaying(GunCHN) Then
		ResumeChannel(GunCHN)
	EndIf
	If GunCHN2 <> 0 And ChannelPlaying(GunCHN2) Then
		ResumeChannel(GunCHN2)
	EndIf
	If ChatSFXCHN <> 0 And ChannelPlaying(ChatSFXCHN) Then
		ResumeChannel(ChatSFXCHN)
	EndIf
	If NTF_ChatCHN1 <> 0 And ChannelPlaying(NTF_ChatCHN1) Then
		ResumeChannel(NTF_ChatCHN1)
	EndIf
	If NTF_ChatCHN2 <> 0 And ChannelPlaying(NTF_ChatCHN2) Then
		ResumeChannel(NTF_ChatCHN2)
	EndIf
	
	If SCRAMBLECHN <> 0 Then
		If ChannelPlaying(SCRAMBLECHN) Then ResumeChannel(SCRAMBLECHN)
	EndIf
	
;	If OmegaWarheadCHN <> 0 Then
;		If ChannelPlaying(OmegaWarheadCHN) Then ResumeChannel(OmegaWarheadCHN)
;	EndIf
	
	If CIChn <> 0 Then
		If ChannelPlaying(CIChn) Then ResumeChannel(CIChn)
	EndIf
	
	If hds\SoundCHN <> 0 Then
		If ChannelPlaying(hds\SoundCHN) Then ResumeChannel(hds\SoundCHN)
	EndIf
	
	For i = 0 To 1
		If ChannelPlaying(LowBatteryCHN[i]) Then ResumeChannel(LowBatteryCHN[i])
	Next
	
	For ne = Each NewElevator
		If ne\soundchn <> 0 Then
			SetStreamPaused_Strict(ne\soundchn,False)
		EndIf
	Next
	
	If psp <> Null Then
		If psp\SoundCHN <> 0 And ChannelPlaying(psp\SoundCHN) Then
			ResumeChannel(psp\SoundCHN)
		EndIf
	EndIf	
	
End Function

Function KillSounds()
	Local i%,e.Events,n.NPCs,d.Doors,snd.Sound;, sub.Subtitles
	
	For i=0 To 9
		If TempSounds[i]<>0 Then FreeSound_Strict TempSounds[i] : TempSounds[i]=0
	Next
	For e.Events = Each Events
		If e\SoundCHN <> 0 Then
			If (Not e\SoundCHN_isStream)
				If ChannelPlaying(e\SoundCHN) Then StopChannel(e\SoundCHN)
			Else
				StopStream_Strict(e\SoundCHN)
			EndIf
		EndIf
		If e\SoundCHN2 <> 0 Then
			If (Not e\SoundCHN2_isStream)
				If ChannelPlaying(e\SoundCHN2) Then StopChannel(e\SoundCHN2)
			Else
				StopStream_Strict(e\SoundCHN2)
			EndIf
		EndIf
		If e\SoundCHN3 <> 0 Then
			If (Not e\SoundCHN3_isStream)
				If ChannelPlaying(e\SoundCHN3) Then StopChannel(e\SoundCHN3)
			Else
				StopStream_Strict(e\SoundCHN3)
			EndIf
		EndIf
		If e\SoundCHN4 <> 0 Then
			If (Not e\SoundCHN4_isStream)
				If ChannelPlaying(e\SoundCHN4) Then StopChannel(e\SoundCHN4)
			Else
				StopStream_Strict(e\SoundCHN4)
			EndIf
		EndIf
	Next
	For n.NPCs = Each NPCs
		If n\SoundChn <> 0 Then
			If (Not n\SoundChn_IsStream)
				If ChannelPlaying(n\SoundChn) Then StopChannel(n\SoundChn)
			Else
				StopStream_Strict(n\SoundChn)
			EndIf
		EndIf
		If n\SoundChn2 <> 0 Then
			If (Not n\SoundChn2_IsStream)
				If ChannelPlaying(n\SoundChn2) Then StopChannel(n\SoundChn2)
			Else
				StopStream_Strict(n\SoundChn2)
			EndIf
		EndIf
		If n\ShootSFXCHN <> 0
			If ChannelPlaying(n\ShootSFXCHN) Then StopChannel(n\ShootSFXCHN)
		EndIf
	Next	
	For d.Doors = Each Doors
		If d\SoundCHN <> 0 Then
			If ChannelPlaying(d\SoundCHN) Then StopChannel(d\SoundCHN)
		EndIf
	Next
	If SCRAMBLECHN <> 0 Then
		If ChannelPlaying(SCRAMBLECHN) Then StopChannel(SCRAMBLECHN)
	EndIf
	For i = 0 To 1
		If ChannelPlaying(LowBatteryCHN[i]) Then StopChannel(LowBatteryCHN[i])
	Next
	If AmbientSFXCHN <> 0 Then
		If ChannelPlaying(AmbientSFXCHN) Then StopChannel(AmbientSFXCHN)
	EndIf
	If BreathCHN <> 0 Then
		If ChannelPlaying(BreathCHN) Then StopChannel(BreathCHN)
	EndIf
	If IntercomStreamCHN <> 0 Then
		StopStream_Strict(IntercomStreamCHN)
	EndIf
	For snd.Sound = Each Sound
		If snd <> Object.Sound(CurrOverhaulSFX)
			For i = 0 To 31
				If snd\channels[i]<>0
					StopChannel snd\channels[i]
				EndIf
			Next
		EndIf
	Next
	If opt\EnableSFXRelease
		For snd.Sound = Each Sound
			If snd\internalHandle <> 0
				If snd <> Object.Sound(CurrOverhaulSFX)
					FreeSound snd\internalHandle
					snd\internalHandle = 0
					snd\releaseTime = 0
				EndIf
			EndIf
		Next
	EndIf
	
	DebugLog "Terminated all sounds"
	
End Function

Function GetStepSound(entity%,collradius#=0.3)
    Local picker%,brush%,texture%,name$,i%
    Local mat.Materials
	Local ne.NewElevator
	Local wa.Water
    
	For wa = Each Water
		If wa\isrendering Then
			If EntityY(entity)<(wa\customY+collradius#) Then
				Local p.Particles = CreateParticle(EntityX(entity),wa\customY,EntityZ(entity),10,0.05,0.0,500)
				p\SizeChange = 0.01
				p\Achange = -0.01
				SpriteViewMode p\obj,2
				RotateEntity p\obj,90,0,0
				Return 2
			EndIf
		EndIf
	Next
	
	For ne = Each NewElevator
		If Abs(EntityX(Collider)-EntityX(ne\obj,True))<=280.0*RoomScale+(0.015*fps\Factor[0]) Then
			If Abs(EntityZ(Collider)-EntityZ(ne\obj,True))<=280.0*RoomScale+(0.015*fps\Factor[0]) Then
				If Abs(EntityY(Collider)-EntityY(ne\obj,True))<=280.0*RoomScale+(0.015*fps\Factor[0]) Then
					Return 1
				EndIf
			EndIf
		EndIf
	Next
	
    picker = LinePick(EntityX(entity),EntityY(entity),EntityZ(entity),0,-1,0)
    If picker <> 0 Then
        If GetEntityType(picker) <> HIT_MAP Then Return 0
        brush = GetSurfaceBrush(GetSurface(picker,CountSurfaces(picker)))
        If brush <> 0 Then
			For i = 3 To 1 Step -1
				texture = GetBrushTexture(brush,i)
				If texture <> 0 Then
					name = StripPath(TextureName(texture))
					If (name <> "") Then
						DeleteSingleTextureEntryFromCache(texture)
						For mat.Materials = Each Materials
							If mat\name = name Then
								If mat\StepSound > 0 Then
									FreeBrush(brush)
									Return mat\StepSound-1
								EndIf
								Exit
							EndIf
						Next
					EndIf
				EndIf
			Next
        EndIf
    EndIf
    
    Return 0
End Function

Function UpdateSoundOrigin(Chn%, cam%, entity%, range# = 10, volume# = 1.0, Eric = False)
	range# = Max(range,1.0)
	Local n.NPCs
	
	If volume>0 Then
		
		Local dist# = EntityDistance(cam, entity) / range#
		If 1 - dist# > 0 And 1 - dist# < 1 Then
			
			Local panvalue# = Sin(-DeltaYaw(cam,entity))
			If Eric Then
				ChannelVolume(Chn, volume# * (1 - dist#))
			Else
				ChannelVolume(Chn, volume# * (1 - dist#)*(opt\SFXVolume#*opt\MasterVol))
			EndIf
			ChannelPan(Chn, panvalue)
		EndIf
	Else
		If Chn <> 0 Then
			ChannelVolume (Chn, 0)
		EndIf 
	EndIf
End Function

Function UpdateSoundFMOD(Chn%, cam%, entity%, range# = 10, volume# = 1.0)
	range# = Max(range,1.0)
	
	If volume>0 Then
		
		Local dist# = EntityDistance(cam, entity) / range#
		If 1 - dist# > 0 And 1 - dist# < 1 Then
			
			Local panvalue# = Sin(-DeltaYaw(cam,entity))
			
			ChannelVolume(Chn, (volume# * (1 - dist#)*opt\SFXVolume#)*255)
			ChannelPan(Chn, Int((255.0/2.0)+((255.0/2.0)*panvalue)))
		Else
			ChannelVolume(Chn, 0)
		EndIf
	Else
		If Chn <> 0 Then ChannelVolume(Chn, 0)
	EndIf
End Function

Function ControlSoundVolume()
	Local snd.Sound,i
	
	For snd.Sound = Each Sound
		For i=0 To 31
			ChannelVolume snd\channels[i],opt\SFXVolume#
		Next
	Next
	
End Function

Function UpdateDeafPlayer()
	
	If DeafTimer > 0
		DeafTimer = DeafTimer-fps\Factor[0]
		opt\SFXVolume# = 0.0
		If opt\SFXVolume# > 0.0
			ControlSoundVolume()
		EndIf
		DebugLog DeafTimer
	Else
		DeafTimer = 0
		If DeafPlayer Then ControlSoundVolume()
		DeafPlayer = False
	EndIf
	
End Function

Function PlayAnnouncement(file$)
	
	If IntercomStreamCHN <> 0 Then
		StopStream_Strict(IntercomStreamCHN)
		IntercomStreamCHN = 0
	EndIf
	
	IntercomStreamCHN = StreamSound_Strict(file$,opt\SFXVolume*opt\MasterVol,0)
	
End Function

Function UpdateStreamSounds()
	Local e.Events
	
	If fps\Factor[0] > 0
		If IntercomStreamCHN <> 0
			SetStreamVolume_Strict(IntercomStreamCHN,opt\SFXVolume*opt\MasterVol)
		EndIf
		For e = Each Events
			If e\SoundCHN<>0
				If e\SoundCHN_isStream
					SetStreamVolume_Strict(e\SoundCHN,opt\SFXVolume*opt\MasterVol)
				EndIf
			EndIf
			If e\SoundCHN2<>0
				If e\SoundCHN2_isStream
					SetStreamVolume_Strict(e\SoundCHN2,opt\SFXVolume*opt\MasterVol)
				EndIf
			EndIf
			If e\SoundCHN3<>0
				If e\SoundCHN3_isStream
					SetStreamVolume_Strict(e\SoundCHN3,opt\SFXVolume*opt\MasterVol)
				EndIf
			EndIf
			If e\SoundCHN4<>0
				If e\SoundCHN4_isStream
					SetStreamVolume_Strict(e\SoundCHN4,opt\SFXVolume*opt\MasterVol)
				EndIf
			EndIf
		Next
	EndIf
	
	If (Not PlayerInReachableRoom())
		If PlayerRoom\RoomTemplate\Name <> "gate_b_topside" And PlayerRoom\RoomTemplate\Name <> "gate_a_topside"
			If IntercomStreamCHN <> 0
				StopStream_Strict(IntercomStreamCHN)
				IntercomStreamCHN = 0
			EndIf
			For e = Each Events
				If e\SoundCHN<>0 And e\SoundCHN_isStream
					StopStream_Strict(e\SoundCHN)
					e\SoundCHN = 0
					e\SoundCHN_isStream = 0
				EndIf
				If e\SoundCHN2<>0 And e\SoundCHN2_isStream
					StopStream_Strict(e\SoundCHN2)
					e\SoundCHN2 = 0
					e\SoundCHN2_isStream = 0
				EndIf
				If e\SoundCHN3<>0 And e\SoundCHN3_isStream
					StopStream_Strict(e\SoundCHN3)
					e\SoundCHN3 = 0
					e\SoundCHN3_isStream = 0
				EndIf
				If e\SoundCHN4<>0 And e\SoundCHN4_isStream
					StopStream_Strict(e\SoundCHN4)
					e\SoundCHN4 = 0
					e\SoundCHN4_isStream = 0
				EndIf
			Next
		EndIf
	EndIf
	
End Function

Function LoadAllSounds()
	Local i
	
	hds\Sound[0] = LoadSound_Strict("SFX\HDS\Startup.ogg")
	hds\Sound[1] = LoadSound_Strict("SFX\HDS\minor_fracture.ogg")
	hds\Sound[2] = LoadSound_Strict("SFX\HDS\major_fracture.ogg")
	hds\Sound[3] = LoadSound_Strict("SFX\HDS\minor_lacerations.ogg")
	hds\Sound[4] = LoadSound_Strict("SFX\HDS\major_lacerations.ogg")
	hds\Sound[5] = LoadSound_Strict("SFX\HDS\health_critical.ogg")
	hds\Sound[6] = LoadSound_Strict("SFX\HDS\near_death.ogg")
	hds\Sound[7] = LoadSound_Strict("SFX\HDS\death_line.wav")
	For i = 8 To 21
		hds\Sound[i] = LoadSound_Strict("SFX\HDS\Broken\broken ("+(i-7)+").wav")
	Next
	hds\Sound[22] = LoadSound_Strict("SFX\HDS\no_ammo.ogg")
	hds\Sound[23] = LoadSound_Strict("SFX\HDS\power_up.ogg")
	hds\Sound[24] = LoadSound_Strict("SFX\HDS\Explode.ogg")
	
	For i = 0 To 2
		HitSnd[i] = LoadSound_Strict("SFX\Guns\Grenade\fall"+(i+1)+".ogg")
	Next
	
	I_1102RU\Sound[0] = LoadSound_Strict("SFX\SCP\1102RU\Enter.ogg")
	
	TruckSFX = LoadSound_Strict("SFX\Room\Engine.ogg")
	
	OmegaWarheadSFX[0] = LoadSound_Strict("SFX\Alarm\Omega_Warhead_Alarm.ogg")
	OmegaWarheadSFX[1] = LoadSound_Strict("SFX\Alarm\Omega_Warhead_Detonate.ogg")
	
	For i = 0 To 2
		SplashTextSFX[i] = LoadSound_Strict("SFX\Interact\Type ("+(i+1)+").ogg")
	Next
	
	For i = 0 To 7
		EquipmentSFX[i] = LoadSound_Strict("SFX\Player\StepSounds\Equipment_Walk"+(i+1)+".ogg")
		EquipmentSFX[8 + i] = LoadSound_Strict("SFX\Player\StepSounds\Equipment_Run"+(i+1)+".ogg")
	Next
	
	For i = 0 To 3
		HDSWalkSFX[i] = LoadSound_Strict("SFX\HDS\Step\Step ("+(i+1)+").ogg")
	Next
	
	For i = 0 To 2
		OpenDoorSFX[0 * 3 + i] = LoadSound_Strict("SFX\Door\DoorOpen" + (i + 1) + ".ogg")
		CloseDoorSFX[0 * 3 + i] = LoadSound_Strict("SFX\Door\DoorClose" + (i + 1) + ".ogg")
		OpenDoorSFX[3 * 3 + i] = LoadSound_Strict("SFX\Door\ElevatorOpen" + (i + 1) + ".ogg")
		CloseDoorSFX[3 * 3 + i] = LoadSound_Strict("SFX\Door\ElevatorClose" + (i + 1) + ".ogg")
	Next
	For i = 0 To 1
		OpenDoorSFX[1 * 3 + i] = LoadSound_Strict("SFX\Door\BigDoorOpen" + (i + 1) + ".ogg")
		CloseDoorSFX[1 * 3 + i] = LoadSound_Strict("SFX\Door\BigDoorClose" + (i + 1) + ".ogg")
	Next
	OpenGlassDoorSFX = LoadSound_Strict("SFX\Door\DoorGOpen" + (Rand(1,3)) + ".ogg")
	CloseGlassDoorSFX = LoadSound_Strict("SFX\Door\DoorGClose" + (Rand(1,3)) + ".ogg")
	
	OpenOfficeDoorSFX = LoadSound_Strict("SFX\Door\OfficeDoorOpen" + (Rand(1,3)) + ".ogg")
	CloseOfficeDoorSFX = LoadSound_Strict("SFX\Door\OfficeDoorClose.ogg")
	DoorBudgeSFX = LoadSound_Strict("SFX\Door\OfficeDoorBudge.ogg")
	
	OpenEzDoorSFX = LoadSound_Strict("SFX\Door\DoorEzOpen.ogg")
	CloseEzDoorSFX = LoadSound_Strict("SFX\Door\DoorEzClose.ogg")
	
	OpenHCzDoorSFX = LoadSound_Strict("SFX\Door\DoorHCzOpen.ogg")
	CloseHCzDoorSFX = LoadSound_Strict("SFX\Door\DoorHCzClose.ogg")
	
	DoorSparksSFX = LoadSound_Strict("SFX\Door\DoorSparks.ogg")
	
	DrawLoading(31,False,"","SOUND PACK #1")
	
	KeyCardSFX1 = LoadSound_Strict("SFX\Interact\KeyCardUse1.ogg")
	KeyCardSFX2 = LoadSound_Strict("SFX\Interact\KeyCardUse2.ogg")
	ScannerSFX1 = LoadSound_Strict("SFX\Interact\ScannerUse1.ogg")
	ScannerSFX2 = LoadSound_Strict("SFX\Interact\ScannerUse2.ogg")
	
	DrawLoading(32,False,"","SOUND PACK #2")
	
	OpenDoorFastSFX=LoadSound_Strict("SFX\Door\DoorOpenFast.ogg")
	CautionSFX% = LoadSound_Strict("SFX\Room\LockroomSiren.ogg")
	
	AirlockSFX[0] = LoadSound_Strict("SFX\Door\Airlock1.ogg")
	AirlockSFX[1] = LoadSound_Strict("SFX\Door\Airlock2.ogg")
	
	CameraSFX = LoadSound_Strict("SFX\General\Camera.ogg") 
	
	StoneDragSFX% = LoadSound_Strict("SFX\SCP\173\StoneDrag.ogg")
	
	GunshotSFX% = LoadSound_Strict("SFX\General\Gunshot.ogg")
	Gunshot2SFX% = LoadSound_Strict("SFX\General\Gunshot2.ogg")
	Gunshot3SFX% = LoadSound_Strict("SFX\General\BulletMiss.ogg")
	BullethitSFX% = LoadSound_Strict("SFX\General\BulletHit.ogg")
	
	DrawLoading(33,False,"","SOUND PACK #3")
	
	TeslaIdleSFX = LoadSound_Strict("SFX\Room\Tesla\Idle.ogg")
	TeslaActivateSFX = LoadSound_Strict("SFX\Room\Tesla\WindUp.ogg")
	TeslaPowerUpSFX = LoadSound_Strict("SFX\Room\Tesla\PowerUp.ogg")
	
	MagnetUpSFX% = LoadSound_Strict("SFX\Room\106Chamber\MagnetUp.ogg") 
	MagnetDownSFX = LoadSound_Strict("SFX\Room\106Chamber\MagnetDown.ogg")
	
	For i = 0 To 3
		DecaySFX[i] = LoadSound_Strict("SFX\SCP\106\Decay" + i + ".ogg")
	Next
	
	DrawLoading(34,False,"","SOUND PACK #4")
	
	BurstSFX = LoadSound_Strict("SFX\Room\TunnelBurst.ogg")
	
	For i = 0 To 2
		RustleSFX[i] = LoadSound_Strict("SFX\SCP\372\Rustle" + i + ".ogg")
	Next
	
	Death914SFX% = LoadSound_Strict("SFX\SCP\914\PlayerDeath.ogg") 
	Use914SFX% = LoadSound_Strict("SFX\SCP\914\PlayerUse.ogg")
	
	For i = 0 To 1
  	    SizzSFX(i) = LoadSound_Strict("SFX\SCP\1079\BubbleSizz" + i + ".ogg")
	Next
	
	For i = 0 To 3
		DripSFX[i] = LoadSound_Strict("SFX\Player\BloodDrip" + i + ".ogg")
	Next
	
	DrawLoading(35,False,"","SOUND PACK #5")
	
	LeverSFX% = LoadSound_Strict("SFX\Interact\LeverFlip.ogg") 
	LightSFX% = LoadSound_Strict("SFX\General\LightSwitch.ogg")
	
	ButtGhostSFX% = LoadSound_Strict("SFX\SCP\Joke\789J.ogg")
	
	RadioSFX[0 * 10] = LoadSound_Strict("SFX\Radio\RadioAlarm.ogg")
	RadioSFX[0 * 10 + 1] = LoadSound_Strict("SFX\Radio\RadioAlarm2.ogg")
	For i = 0 To 8
		RadioSFX[1 * 10 + i] = LoadSound_Strict("SFX\Radio\scpradio"+i+".ogg")
	Next
	RadioSquelch = LoadSound_Strict("SFX\Radio\squelch.ogg")
	RadioStatic = LoadSound_Strict("SFX\Radio\static.ogg")
	RadioBuzz = LoadSound_Strict("SFX\Radio\buzz.ogg")
	
	DrawLoading(36,False,"","SOUND PACK #6")
	
	ElevatorBeepSFX = LoadSound_Strict("SFX\General\Elevator\Beep.ogg") 
	ElevatorMoveSFX = LoadSound_Strict("SFX\General\Elevator\Moving.ogg") 
	
	For i = 0 To 4
		PickSFX[i] = LoadSound_Strict("SFX\Interact\PickItem" + i + ".ogg")
	Next
	
	PickSFX[5] = LoadSound_Strict("SFX\Interact\PickUpKevlar.ogg")
	
	;0 = light containment, 1 = heavy containment, 2 = entrance
	AmbientSFXAmount[0]=11 : AmbientSFXAmount[1]=11 : AmbientSFXAmount[2]=12
	;3 = general, 4 = pre-breach
	AmbientSFXAmount[3]=15 : AmbientSFXAmount[4]=5
	;5 = forest
	AmbientSFXAmount[5]=10
	
	For i = 0 To 2
		OldManSFX[i] = LoadSound_Strict("SFX\SCP\106\Corrosion" + (i + 1) + ".ogg")
	Next
	OldManSFX[3] = LoadSound_Strict("SFX\SCP\106\Laugh.ogg")
	OldManSFX[4] = LoadSound_Strict("SFX\SCP\106\Breathing.ogg")
	OldManSFX[5] = LoadSound_Strict("SFX\Room\PocketDimension\Enter.ogg")
	For i = 0 To 2
		OldManSFX[6+i] = LoadSound_Strict("SFX\SCP\106\WallDecay"+(i+1)+".ogg")
	Next
	
	DrawLoading(37,False,"","SOUND PACK #7")
	
	For i = 0 To 2
		Scp173SFX[i] = LoadSound_Strict("SFX\SCP\173\Rattle" + (i + 1) + ".ogg")
	Next
	
	For i = 0 To 15
		HorrorSFX[i] = LoadSound_Strict("SFX\Horror\Horror" + i + ".ogg")
	Next
	
	DrawLoading(38,False,"","SOUND PACK #8")
	
	IntroSFX[0] = LoadSound_Strict("SFX\Room\Intro\Bang3.ogg")
	For i = 1 To 3
		IntroSFX[i] = LoadSound_Strict("SFX\Room\Intro\Light" + (i) + ".ogg")
	Next
	IntroSFX[4] = LoadSound_Strict("SFX\Room\Intro\173Vent.ogg")
	
	AlarmSFX[0] = LoadSound_Strict("SFX\Alarm\Alarm.ogg")
	AlarmSFX[1] = LoadSound_Strict("SFX\Alarm\Alarm3.ogg")
	AlarmSFX[2] = LoadSound_Strict("SFX\Alarm\Alarm4.ogg")
	AlarmSFX[3] = LoadSound_Strict("SFX\Alarm\Alarm5.ogg")
	AlarmSFX[4] = LoadSound_Strict("SFX\Alarm\Alarm6.ogg")
	AlarmSFX[5] = LoadSound_Strict("SFX\Alarm\Alarm7.ogg")
	AlarmSFX[6] = LoadSound_Strict("SFX\Alarm\Alarm8.ogg")
	AlarmSFX[7] = LoadSound_Strict("SFX\Alarm\Alarm9.ogg")
	AlarmSFX[8] = LoadSound_Strict("SFX\Alarm\Alarm10.ogg")
	AlarmSFX[9] = LoadSound_Strict("SFX\Alarm\Alarm11.ogg")
	AlarmSFX[10] = LoadSound_Strict("SFX\Alarm\Alarm12.ogg")
	
	DrawLoading(39,False,"","SOUND PACK #9")
	
	HeartBeatSFX = LoadSound_Strict("SFX\Player\Heartbeat.ogg")
	
	For i = 0 To 4
		BreathSFX[0 * 5 + i]=LoadSound_Strict("SFX\Character\Player\breath"+i+".ogg")
		BreathSFX[1 * 5 + i]=LoadSound_Strict("SFX\Character\Player\breath"+i+"gas.ogg")
	Next
	
	For i = 0 To 2
		NeckSnapSFX[i] =  LoadSound_Strict("SFX\SCP\173\NeckSnap"+(i+1)+".ogg")
	Next
	
	For i = 0 To 8
		DamageSFX[i] = LoadSound_Strict("SFX\Character\Player\Damage"+(i+1)+".ogg")
	Next
	
	DrawLoading(40,False,"","SOUND PACK #10")
	
	For i = 0 To 2
		CoughSFX[i] = LoadSound_Strict("SFX\Player\Cough" + (i + 1) + ".ogg")
	Next
	
	For i = 0 To 1
		LowBatterySFX[i] = LoadSound_Strict("SFX\General\LowBattery" + (i + 1) + ".ogg")
	Next
	
	SCRAMBLESFX% = LoadSound_Strict("SFX\General\SCRAMBLE.ogg")
	
	MachineSFX% = LoadSound_Strict("SFX\SCP\914\Refining.ogg")
	
	ApacheSFX = LoadSound_Strict("SFX\Character\Apache\Propeller.ogg")
	
	DrawLoading(41,False,"","SOUND PACK #11")
	
	For i = 0 To 7
		SetStepSFX(0, 0, i, LoadSound_Strict("SFX\Step\Step" + (i + 1) + ".ogg"))
		SetStepSFX(1, 0, i, LoadSound_Strict("SFX\Step\StepMetal" + (i + 1) + ".ogg"))
		SetStepSFX(0, 1, i, LoadSound_Strict("SFX\Step\Run" + (i + 1) + ".ogg"))
		SetStepSFX(1, 1, i, LoadSound_Strict("SFX\Step\RunMetal" + (i + 1) + ".ogg"))
		If i < 3
			SetStepSFX(2, 0, i, LoadSound_Strict("SFX\Character\MTF\Step" + (i + 1) + ".ogg"))
			SetStepSFX(3, 0, i, LoadSound_Strict("SFX\SCP\049\Step"+ (i + 1) + ".ogg"))
		EndIf
		If i < 4
			SetStepSFX(4, 0, i, LoadSound_Strict("SFX\Step\SCP\StepSCP" + (i + 1) + ".ogg"))
		EndIf
	Next
	
	DrawLoading(42,False,"","FINAL SOUND PACK")
	
	ChatSFX_On = LoadSound_Strict("SFX\Player\RadioOn.ogg")
	ChatSFX_Off = LoadSound_Strict("SFX\Player\RadioOff.ogg")
	
	ChatSFX_CurrSound = 0
	
	For i = 0 To 7
		NTF_PainSFX[i]=LoadSound_Strict("SFX\player\pain"+(i+1)+".ogg")
	Next
	For i = 0 To 1
		NTF_PainWeakSFX[i]=LoadSound_Strict("SFX\player\painweak"+(i+1)+".ogg")
	Next
	
	For i = 0 To 2
		Step2SFX[i] = LoadSound_Strict("SFX\Step\StepPD" + (i + 1) + ".ogg")
		Step2SFX[i+3] = LoadSound_Strict("SFX\Step\StepForest" + (i + 1) + ".ogg")
	Next 
End Function
;~IDEal Editor Parameters:
;~C#Blitz3D